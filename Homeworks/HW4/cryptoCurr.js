var fs = require('fs');
var net = require('net');
var crypto = require('crypto');
var events = require('events');

var PORT_MIN_RANGE = 9000
var PORT_MAX_RANGE = 9010

var ZEROES_REQ = 10;

var INITIAL_LEDGER = {
  '404f8fd144': 132,
  '07f946d659': 46,
  'c214b8bfb6': 8
};

// Constructor: takes a public key, a private key, and a connection.
function CoinClient(privKeyFile, pubKeyFile, conn) {
  this.privKey = fs.readFileSync(privKeyFile).toString('ascii');
  this.pubKey = fs.readFileSync(pubKeyFile).toString('ascii');
  this.ledger = INITIAL_LEDGER;
  this.srvr = net.createServer();
  this.srvr.on('connection', this.makeMessageReceiver(this));
  this.srvr.listen(conn.port);
  // Get the latest version of the ledger
  this.broadcast({type: 'getledger'});
}

// Inheritance in JavaScript -- all instances of CoinClient
// will inherit the functionality of EventEmitter.
CoinClient.prototype = new events.EventEmitter();

// On receiving a broadcast message, trigger the appropriate event handler
CoinClient.prototype.makeMessageReceiver = function(self) {
  return function(client) {
    client.on('data', function(data) {
      var trans = JSON.parse(data);
      // Ignore your own messages
      if (trans.id === self.getID()
            && trans.type !== 'transfer'
            && trans.type !== 'proof')
        return;
      self.emit(trans.type, self, trans);
    });
  };
}

// On a request for the latest ledger, broadcast what you have.
CoinClient.prototype.on('getledger', function(self, trans) {
  self.broadcast({type:'shareledger', 'ledger':self.ledger});
});

// On receiving an updated ledger, update your own copy
CoinClient.prototype.on('shareledger', function(self, trans) {
  self.ledger = trans.ledger;
  self.log("Transaction ledger updated");
  self.showLedger();
});

CoinClient.prototype.on('transfer', function(self, trans) {
  self.validateTransfer(trans);
});

CoinClient.prototype.on('reject', function(self, trans) {
  self.log("Reject from " + trans.id + ": " + trans.msg);
});


// Broadcast a transfer of money to all parties
CoinClient.prototype.transferFunds = function(details) {
  var sign = crypto.createSign('RSA-SHA256');
  var trans = { type: 'transfer'};
  var msg = JSON.stringify(details);
  trans.details = details;
  trans.pubKey = this.pubKey;
  trans.id = this.getID();

  //
  // YOUR CODE HERE
  //

  this.broadcast(trans);
}



CoinClient.prototype.validateTransfer = function(trans) {
  var verifier = crypto.createVerify('RSA-SHA256');
  var msg = JSON.stringify(trans.details);

  //
  // YOUR CODE HERE
  //

  var coins = this.ledger[trans.id];

  // Create new ledger
  var newLedger = {};
  for (var id in this.ledger) {
    newLedger[id] = this.ledger[id];
  }
  // All coins must be accounted for in the transaction
  newLedger[trans.id] = 0;
  // Retaining a copy of the old ledger
  newLedger.prev = this.ledger;

  // Update transaction
  for (var id in trans.details) {
    coins -= trans.details[id];
    if (coins < 0) {
      this.broadcast({type: 'reject', msg: 'insufficient funds'});
      return;
    }
    newLedger[id] += trans.details[id];
  }

  // Pay the miner
  newLedger[this.id] = newLedger[this.id] + 1; // New coin is created

  this.mineProof(newLedger, 0);
}


CoinClient.prototype.mineProof = function(newLedger, start) {
  if (this.chainLength(this.ledger) >= this.chainLength(newLedger)) return;
  var ledge = JSON.stringify(newLedger);
  var proof;

  //
  // YOUR CODE HERE
  //
  // TIP: Find a proof such that hash(ledge+s) produces the right
  // number of leading zeroes
  //

  this.broadcast({type: 'proof', ledger: newLedger, proof: proof});
}

CoinClient.prototype.hash = function(s) {
  var i, ch;
  var binStr = "";
  var h = crypto.createHash('sha256').update(s).digest('hex');
  for (i=0; i<h.length; i++) {
    digits = parseInt(h[i],16).toString(2);
    while (digits.length < 4) { digits = '0' + digits; }
    binStr += digits;
  }
  return binStr;
}


CoinClient.prototype.chainLength = function(ledger) {
  if (ledger) return 1 + this.chainLength(ledger.prev);
  else return 0;
}


// Creating a more readable ID (but anonymized) string
CoinClient.prototype.getID = function() {
  this.id = this.id || crypto.createHash('sha256').update(this.pubKey).digest('hex').slice(0,10);
  return this.id;
}

CoinClient.prototype.getCoins = function() {
  return this.ledger[this.getID()];
}

CoinClient.prototype.showLedger = function() {
  var keys = Object.keys(this.ledger);
  for (var i in keys) {
    var id = keys[i];
    if (id !== 'prev')
      this.log(id + " has " + this.ledger[id]);
  }
}

CoinClient.prototype.broadcast = function(msgObj) {
  msgObj.id = this.getID();
  var data = JSON.stringify(msgObj);
  for (p=PORT_MIN_RANGE; p<PORT_MAX_RANGE; p++) {
    (function() { // Creating a closure, because JavaScript.
      var client = net.connect({'port':p}, function() {
        client.write(data);
      });
      client.on('error', function(e) {
        //console.error(e);
      });
    })(); // ending closure
  }
}

CoinClient.prototype.log = console.log;

/*********** EXPORTS FOR THIS MODULE **************/

exports.CoinClient = CoinClient;


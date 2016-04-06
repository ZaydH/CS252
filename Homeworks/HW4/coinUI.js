/*
 * Command line interface for cryptocurrency
 */

var cryptoCurr = require('./cryptoCurr');
var readline = require('readline');

function displayCommands() {
  console.log("Type 'getledger' to request the latest ledger from others.");
  console.log("Type 'showledger' to see your own copy of the ledger.");
  console.log("Type 'transfer' to send a note to another user");
  console.log("Type 'exit' to exit the program");
  console.log("Type 'help' to see this message.");
}

// Allocates all coins in the transaction.
// The user may allocate his/herself to keep some coins.
function allocateCoins(coins, trans) {
  trans = trans || {};

  // Base case
  if (coins === 0) {
    cc.transferFunds(trans);
    console.log('Transaction broadcast.');
    rl.prompt();
    return;
  }

  console.log('You have ' + coins + ' coins remaining.');
  rl.question('Specify a user to give coins to: ', function(user) {
    rl.question('How many coins will you give to ' + user + ': ', function (c) {
      c = parseInt(c);
      if (c > coins) {
        console.log('**ERROR** You do not have that many coins');
        allocateCoins(coins, trans);
      } else {
        var prevAmt = trans[user] || 0;
        trans[user] = prevAmt + c;
        allocateCoins(coins - c, trans);
      }
    });
  });
}


function handleTransferReq() {
  var coins = cc.getCoins();
  console.log('***BE SURE TO ALLOCATE ALL COINS***');
  console.log('Any remaining coins you should allocate to yourself');
  console.log('If you forget to include yourself, your coins will disappear');
  allocateCoins(coins);
}


function readCommand() {
  rl.setPrompt("Command> ");
  rl.prompt();
  rl.on('line', function(answer) {
    switch (answer.trim()) {
      case 'getledger':
        cc.broadcast({type: 'getledger'});
        break;
      case 'showledger':
        cc.showLedger();
        break;
      case 'transfer':
        handleTransferReq();
        break;
      case 'help':
        displayCommands();
        break;
      case 'exit':
        process.exit(0);
        break;
      default:
        console.log("I'm sorry, but I don't understand your command");
        displayCommands();
    }
    rl.prompt();
  }).on('close', function() {
    process.exit(0);
  });
}

if (process.argv.length < 5) {
  console.error("Usage: " + process.argv[0] + " " + process.argv[1]
      + " <private key> <public key> <port>");
  process.exit();
}
var privKey = process.argv[2];
var pubKey = process.argv[3];
var conn = {port: process.argv[4]};

var cc = new cryptoCurr.CoinClient(privKey, pubKey, conn);
console.log("Starting process for " + cc.getID());

var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

displayCommands();
readCommand();



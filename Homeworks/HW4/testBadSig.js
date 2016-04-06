var cryptoCurr = require('./cryptoCurr');

// Giving the wrong identity -- Charlie is trying to steal Alice's money
var notAlice = new cryptoCurr.CoinClient('./charliePriv.txt', './alicePub.txt', {port: 9000});

var bob = new cryptoCurr.CoinClient('./bobPriv.txt', './bobPub.txt', {port: 9001});

// Silencing notAlice
notAlice.log = function() {}


// Should be rejected for an invalid signature
notAlice.transferFunds({'404f8fd144': 100, '07f946d659': 30, 'c214b8bfb6': 2});




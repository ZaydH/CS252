var net = require('net');
var eol = require('os').EOL;

var srvr = net.createServer();
var clientList = [];

var LIST_ALL_CLIENTS = "\\list";
var CHANGE_CLIENT_NAME = "\\name";
var PRIVATE_MESSAGE = "\\private";

srvr.on('connection', function(client) {
  client.name = client.remoteAddress + ':' + client.remotePort;
  client.write('Welcome, ' + client.name + eol);
  clientList.push(client);

  client.on('data', function(data) {
    broadcast(data, client);
  });
});

function broadcast(data, client) {

  var splitData;
  var i;
  var j;
  var msgString;

  splitData = data.toString().replace(/[^\x20-\x7E]/gmi, "").split(" ");

  // List all client names
  if(splitData[0] === LIST_ALL_CLIENTS){
    client.write("All Client Names:\n");
    // Iterate through all clients and print their name
    for(i in clientList){
      client.write(clientList[i].name + "\n");
    }
  }
  // Rename the client
  else if(splitData[0] === CHANGE_CLIENT_NAME) {
    client.name = splitData[1];
    client.write("Your client name is: \"" + client.name + "\"\n");
  }
  // Send a private message
  else if(splitData[0] === PRIVATE_MESSAGE){
    for(i in clientList) {
      if (clientList[i].name === splitData[1]) {
        // Rebuild the message string.
        msgString = splitData[2];
        for (j = 3; j < splitData.length; j++) {
          msgString += " " + splitData[j];
        }
        clientList[i].write("From: " + client.name + "\nPrivate Message: " + msgString + "\n");
      }
    }
  }
  // Broadcast the message to all other clients.
  else {
    for (i in clientList) {
      if (client !== clientList[i]) {
        clientList[i].write(client.name + " says " + data);
      }
    }
  }
}



srvr.listen(9000);



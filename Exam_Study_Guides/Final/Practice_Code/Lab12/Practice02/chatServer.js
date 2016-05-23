var net = require('net');
var eol = require('os').EOL;

var srvr = net.createServer();
var clientList = [];

srvr.on('connection', function(client) {
  client.name = client.remoteAddress + ':' + client.remotePort;
  client.write('Welcome, ' + client.name + eol);
  clientList.push(client);

  client.on('data', function(data) {
    broadcast(data, client);
  });
});

function broadcast(data, client) {
  var i;
  var j;
  var listNames;
  // Trim off newlines.
  data = data.toString().trim();

  // Check for name
  if(data.startsWith("/list")){
    listNames = "User Names: ";
    for(i = 0; i < clientList.length; i++){
      listNames += clientList[i].name + " ";
      // Store the location of this client
      if(clientList[i].name === client.name) j = i;
    }
    clientList[j].write(listNames + "\n");
    return;
  }

  // Rename the client.
  if(data.startsWith("/rename ")) {
    data = data.replace("/rename ", "");
    for (i = 0; i < clientList.length; i++) {
      if(clientList[i].name === client.name){
        clientList[i].name = data;
        break;
      }
    }
    clientList[i].write("You were renamed to \"" + client.name + "\".\n")
    return;
  }

  for (var i in clientList) {
    if (client !== clientList[i]) {
      clientList[i].write(client.name + " says " + data);
    }
  }
}

srvr.listen(9000);



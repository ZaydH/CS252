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
    var splitMessage = data.toString().trim().split(" ");
    
    // Handle the private message
    if(splitMessage[0] === "\\private"){
        for(i = 0; i < clientList.length; i++){
            if(clientList[i].name === splitMessage[1]){
                outputStr = "";
                for(j = 2; j < splitMessage.length; j++){
                    outputStr += splitMessage[j] + " ";
                }
                clientList[i].write(client.name + " says " + outputStr + eol);
                return;
            }
        }
        return;
    }
    
    // Handle the private message
    if(splitMessage[0] === "\\list"){
        for(i = 0; i < clientList.length; i++){
            if(clientList[i] === client){
                var otherClients = "";
                // Handle a generic message
                for (var j in clientList) {     
                    otherClients += clientList[j].name + " ";
                }
                clientList[i].write("List of Users: " + otherClients + eol);
                return;
            }
        }
        return;
    }
    
    // Handle the private message
    if(splitMessage[0] === "\\rename"){
        for(i = 0; i < clientList.length; i++){
            if(clientList[i] === client){
                clientList[i].name = splitMessage[1];
                clientList[i].write("You changed your name to " + clientList[i].name + eol);
                return;
            }
        }
        return;
    }
    
    // Handle a generic message
    for (var i in clientList) {     
        if (client !== clientList[i]) {
            clientList[i].write(client.name + " says " + data);
        }
    }
}

srvr.listen(9000);



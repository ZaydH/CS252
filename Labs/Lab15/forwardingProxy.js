// Simplified version of code found on https://developer.mozilla.org/en-US/docs/Web/JavaScript/Old_Proxy_API
function handlerMaker(obj) {
  return {
      delete: function(name) {
          console.log("Deleting the object property: \"" + name + "\"")
          return delete obj[name]; },

      has: function(name) {
          var doesHas = name in obj;
          var description = "Checking if object has property \"" + name + "\"  ";
          if(doesHas){
              console.log(description + "(It does)");
          }
          else{
              console.log(description + "(It does not)");
          }
          return name in obj; },

      hasOwn: function(name) {
          console.log("Checking in the object has its own property \"" + name + "\"")
          return Object.prototype.hasOwnProperty.call(obj, name); },

      get: function(receiver, name) {
          var val = obj[name];
          console.log("Getting Property: \"" + name + "\" = " + val)
          return val; },

      set: function(receiver, name, val) {
          console.log("Setting Property: \"" + name + "\" = " + val)
          obj[name] = val; return true; },

      enumerate: function() {
          console.log("Enumerating the object")
          var result = [];
          for (name in obj) { result.push(name); };
          return result;
      },
      keys: function() {
          console.log("Getting object keys.")
          return Object.keys(obj)
      }
  };
}

// ...

var o = Object.create({});
var proxy = Proxy.create(handlerMaker(o));

proxy.blabla = 12; // Thanks to the forwarding, o now has a 'blabla' property with a value of 12
o.blabla++; // just incrementing o.blabla

console.log(proxy.blabla); // prints 13: the getting operation is forwarded to o which returns 13.

// Check "has"
"test" in proxy;

// Check "hasOwn"
Object.prototype.hasOwnProperty.call(proxy, "test");

for(x in proxy){
    x;
}

Object.keys(proxy);

delete proxy.blabla;


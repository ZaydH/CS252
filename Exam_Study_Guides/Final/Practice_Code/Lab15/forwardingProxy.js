// Simplified version of code found on https://developer.mozilla.org/en-US/docs/Web/JavaScript/Old_Proxy_API
function handlerMaker(obj) {
  return {
    delete:       function(name) { return delete obj[name]; },
    has:          function(name) { return name in obj; },
    hasOwn:       function(name) { return Object.prototype.hasOwnProperty.call(obj, name); },
    get:          function(receiver, name) { return obj[name]; },
    set:          function(receiver, name, val) { obj[name] = val; return true; },
    enumerate:    function() {
      var result = [];
      for (name in obj) { result.push(name); };
      return result;
    },
    keys: function() { return Object.keys(obj) }
  };
}

// ...

var o = Object.create({});
var proxy = Proxy.create(handlerMaker(o));

proxy.blabla = 12; // Thanks to the forwarding, o now has a 'blabla' property with a value of 12
o.blabla++; // just incrementing o.blabla

console.log(proxy.blabla); // prints 13: the getting operation is forwarded to o which returns 13.

delete proxy.blabla


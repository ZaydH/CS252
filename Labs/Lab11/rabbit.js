var name = "Monty";

function Rabbit(name) {
  "use strict";
  this.name = name;
}
var r = new Rabbit("Python");

console.log(r.name);  // ERROR!!! - fixed by Zayd
console.log(name);    // Prints "Python" - fixed by Zayd

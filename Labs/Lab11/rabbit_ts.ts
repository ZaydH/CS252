var name : string = "Monty";
function Rabbit(name : string) {
  this.name = name;
}
var r = new Rabbit("Python");

console.log(r.name);  // ERROR!!!
console.log(name);    // Prints "Python"


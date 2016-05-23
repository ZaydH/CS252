name = "Monty";
class Rabbit{
	name : string;
	constructor(name : string){
  		this.name = name;
	}
	display(){
		console.log(this.name);
	}
}
var r = new Rabbit("Python");

console.log(r.name);  // ERROR!!!
console.log(name);    // Prints "Python"

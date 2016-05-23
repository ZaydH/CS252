function Student(firstName, lastName, studentID){
	this.firstName = firstName;
	this.lastName = lastName;
	this.studentID = studentID;
}
Student.prototype.display = function(){console.log(this.firstName + " " + this.lastName + " " + this.studentID)};

var students = [];
students[0] = new Student("Zayd", "Hammoudeh", 1234);
students[1] = new Student("Muffins", "The Cat", 7849);
students[2] = new Student("Triumph", "Dog", 485);
students[3] = new Student("Mr.", "It", 3221);

students[3].graduated = true;
students[4] = {firstName : "The", lastName: "Hound", studentID: 2345, __proto__ : Student.prototype};

students.forEach(function(val){val.display();});

function add2(x, y){return x+y;}
function sub2(x, y){return x-y;}
function myFoldl(acc, arr, f){
	if(arr.length ===0) return acc;
	return myFoldl(f(acc, arr[0]), arr.slice(1), f);
}
function myFoldr(acc, arr, f){
	if(arr.length ===0) return acc;
	return f(arr[0], myFoldr(acc, arr.slice(1), f));
}
var myArr = [1, 2, 3, 4];
console.log(myFoldl(0, myArr, add2));
console.log(myFoldr(0, myArr, sub2));

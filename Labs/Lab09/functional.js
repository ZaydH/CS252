// Perform foldl in JavaScript using a functional (i.e. recursive style)
var foldl = function (f, acc, array) {
    // Base Case
    if(array.length == 0)
        return acc;
    // Recursive Step
    return foldl(f, f(acc, array[0]), array.slice(1))
}

// Calculate foldl
console.log("foldl(function(x,y){return x+y}, 0, [1,2,3])) = " + foldl(function(x,y){return x+y}, 0, [1,2,3]));

var foldr = function (f, acc, array) {
    // Base Case
    if(array.length == 0)
        return acc;

    // Recursive Step - Get the updated acc.
    acc = foldr(f, acc, array.slice(1));
    return f(array[0], acc);
}

console.log("\nfoldr(function(x,y){return x/y}, 1, [2,4,8]) = " + foldr(function(x,y){return x/y}, 1, [2,4,8]));

var map = function (f, array) {
    // Base Case
    if(array.length == 0)
        return [];
    // Recurse and remove the last element.
    return [f(array[0])] + map(f, array.slice(1));
}
// Calculate a map example.
console.log("\nmap(function(x){return x+x}, [1,2,3,5,7,9,11,13]) = " + map(function(x){return x+x}, [1,2,3,5,7,9,11,13]));


// Write a curry function as we discussed in class.
// Create a `double` method using the curry function
// and the following `mult` function.
Function.prototype.curry = function(){

    var slice = Array.prototype.slice;
    var args = slice.apply(arguments);
    var that = this;
    return function(){
        return that.apply(null, args.concat(slice.apply(arguments)));
    }
}
function mult(x,y) {
  return x * y;
}
var double = mult.curry(2);
console.log("\nThe double of 4 is " + double(4) + "\n")

function createStudents(){

// Make the student class.
    function Student(firstName, lastName, studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.display = function() { console.log("First Name: " + this.firstName + "\nLast Name: " + this.lastName
            + "\nStudent ID: " + this.studentID + "\n") };
    }

    var listOfStudents = [];

    //Build a list of students.
    listOfStudents.push(new Student("Zayd", "Hammoudeh", 123456));
    listOfStudents.push(new Student("Triumph", "The Insult Comic Dog", 89456));
    listOfStudents.push(new Student("Crash", "Bandacoot", 116541));

    // Add the graduated property to the first student (me).
    listOfStudents[0].graduated = true;

    // Create a temporary student
    var tempStudent = { firstName: "Muffins", lastName: "The Cat", studentID: 687987894, __proto__ : new Student() };
    //tempStudent.__proto__ = new Student();
    listOfStudents.push(tempStudent);

    // Print the list of students
    for(var i = 0; i < listOfStudents.length; i++){
        listOfStudents[i].display();
    }

}
createStudents();
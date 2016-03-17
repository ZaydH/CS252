var foldl = function (f, acc, array) {
    for(var i = 0; i < array.length; i++){
        acc = f(acc, array[i]);
    }
    return acc;
}

console.log(foldl(function(x,y){return x+y}, 0, [1,2,3]));

var foldr = function (f, z, array) {
    for(var i = array.length - 1; i >=0; i--){
        z = f(array[i], z);
    }
    return z;
}

console.log(foldr(function(x,y){return x/y}, 1, [2,4,8]));

var map = function (f, array) {
    var result = [];
    for(var i = 0; i < array.length; i++){
        result.push(f(array[i]));
    }
    return result;
}

console.log(map(function(x){return x+x}, [1,2,3,5,7,9,11,13]));


// Write a curry function as we discussed in class.
// Create a `double` method using the curry function
// and the following `mult` function.
function mult(x,y) {
  return x * y;
}
//console.log("The double of 4 is " + double(4))

// Make the student class.
function Student(firstName, lastName, studentID){
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.display = function() { console.log("First Name: " + this.firstName + "\nLast Name: " + this.lastName
                                            + "\nStudent ID: " + this.studentID) };
}
function createStudents(){
    var listOfStudents = [];

    //Build a list of students.
    listOfStudents.push(new Student("Zayd", "Hammoudeh", 123456));
    listOfStudents.push(new Student("Triumph", "The Insult Comic Dog", 89456));
    listOfStudents.push(new Student("Crash", "Bandacoot", 116541));

    // Add the graduated property to the first student (me).
    listOfStudents[0].graduated = true;

    // Create a temporary student
    var tempStudent = { firstName: "Muffins", lastName: "The Cat", studentID: 687987894 };
    tempStudent.__proto__ = new Student();
    listOfStudents.push(tempStudent);

    // Print the list of students
    for(var i = 0; i < listOfStudents.length; i++){
        listOfStudents[i].display();
    }

}
createStudents();
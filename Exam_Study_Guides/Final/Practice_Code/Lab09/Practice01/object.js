function Student(firstName, lastName, studentID){
  this.firstName = firstName;
  this.lastName = lastName;
  this.studentID = studentID;
}
Student.prototype.display = function(){
  console.log( this.firstName + " " + this.lastName + " " + this.studentID);
}

var students = [];
students[0] = new Student("Zayd", "H", 1234);
students[1] = new Student("Jim", "Duggins", 5425);
students[2] = new Student("The", "Rock", 41687);
// Add the graduated property.
students[3] = new Student("Steve", "Austin", 7894);
students[3].graduated = true;
// Create a JavaScript object without the constructor
students[4] = { firstName:"Vince", lastName:"McMahon", studentID: 5464}
students[4].__proto__ = Student.prototype;

students.forEach(function(val){val.display()});
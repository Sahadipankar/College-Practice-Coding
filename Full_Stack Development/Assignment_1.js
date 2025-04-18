// .save ./file name to save the file
// .load ./file name to load the file
// .exit to exit the file
// .clear to clear the terminal
// .help to get help

console.log ("\nHello World, This is Raj Learning NodeJS");

// Variables
let name = "Raj";
const age = 10;
let dateOfBirth = "01/01/1998";
let address = "1234, 5th Street, Toronto";

// Printing Variables
console.log ("Name: ", name);
console.log ("Age: ", age);
console.log ("Date of Birth: ", dateOfBirth);
console.log ("Address: ", address);

// Function to add two numbers
function add (a, b) {
    return a + b;
}

let arrowAdd = (x, y) => console.log(x + y);  //Arrow function to add two numbers
arrowAdd(10, 90);

let a = 10;
let b = 20;
console.log ("\nAddition of ", a, " and ", b, " is: ", add (a, b));

// Conditional Statement
if (age > 18) console.log ("\nYou are an Adult");
else console.log ("\nYou are a Minor");

// Looping from 0 to 10
console.log ("\nLooping from 0 to 10");

for (let i = 0; i <= 10; i++) {
    console.log (i);
}

//Creating an object with properties and method
let employee = {
    Emp_name: "Jasmine",
    Emp_age: 30,
    Emp_address: "1234, 5th Street, Toronto",
    Greet: function() {
        console.log ("\nHello, I am ", this.Emp_name, "and my age is: ", this.Emp_age, "\nI live in ", this.Emp_address);

        console.log (`\nHello, I am ${this.Emp_name} and my age is: ${this.Emp_age} \nI live in ${this.Emp_address}`);  //Backtick 

    }
}

employee.Greet();

// Array of objects
let fruits = ["Mango", "Banano", "Apple", "Grapes"];
console.log ("\nFruits: ", fruits);
fruits.forEach (function(ele) {
    console.log (ele);
});

fruits.forEach((ele) => console.log(`\n ${ele}`));

//Set Timeout 
setTimeout (function() {
    console.log ("\nThis will be printed after 5 seconds");
}, 5000);

setTimeout (function() {
    console.log ("\nThis will be printed after 4 seconds");
}, 4000);

//Set Timeout with Arrow Function
setTimeout (() => {
    console.log ("\nThis new message will be printed after 3 seconds");
}
, 3000);

//Set Interval
let i = 0;
let interval = setInterval (function() {
    console.log ("\nSet Interval every 2 seconds");
    i++;
    if (i === 3) clearInterval (interval);
}, 2000);

console.log("\n", interval);


// //How to create a file in NodeJS
// const fs = require ('fs');
// fs.writeFileSync ('Hello.txt', "Hello World, This is Raj");
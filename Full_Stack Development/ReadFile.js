//How to read a file in NodeJS

const fs = require ('fs');

// //Asynchronous read (Method 1) Non-Blocking code
// const data = fs.readFileSync ('test.js', 'utf8');
// console.log ("\nData from the file: ", data);

//Asynchronous read (Method 2) Non-Blocking code
fs.readFile ('test.js',(err, data) => {
    if (err) throw err;
    console.log (data.toString());
});

// //Asynchronous read (Method 3) Non-Blocking code
// fs.readFile ('test.js', "utf8", function (err, data) {
//     if (err) throw err;
//     console.log (data.toString());
// });

// //Synchronous read (Method 4) Blocking code
// const data1 = fs.readFileSync ('test.js', 'utf8');
// console.log ("\nData from the file: ", data);


//What is the difference between Blocking and Non-Blocking code?
//Blocking code is synchronous and Non-Blocking code is asynchronous. In Blocking code, the execution of the code is halted until the operation is completed. In Non-Blocking code, the execution of the code is not halted and the operation is performed in the background.
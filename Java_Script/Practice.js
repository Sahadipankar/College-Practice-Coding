// function num() {        //setTimeout Function
//     for (let i = 1; i <= 10; i++) {
//         setTimeout(function() {
//             console.log(i);
//         }, i * 3000); // Multiplying by 3000ms to delay each iteration by 3 seconds
//     }
// }

// num();




// function square (num) {
//     return num * num;
// }
// console.log(`\nThe Square of the number is ${square(8)}`); // Output: 25    Template Literals

// let arr = [1, 2, 3, 4, 5, 6]; // Array of numbers
// console.log(arr);




// // Using map() method to iterate over the array
// let brr = arr.map(function(ele){        //This is called callback function passing function as an argument
//     return ele * ele; // Square of each element
// });

// let crr = arr.map(ele => ele * ele * ele); // Using Arrow Function (_=>_) to square each element (Shortcut)

// console.log(brr);
// console.log(crr); 




// let arr = [5, 8, 2, 7, 1, 10, 3, 9, 4, 6]; // Array of numbers

// // Using filter() method to filter out the even numbers
// let brr = arr.filter(function(ele){
//     if (ele % 2 === 0) {    //=== is strict equality operator which checks both value and type of the variable
//         return true;
//     }
// });



// let crr = arr.filter(ele => ele % 2 != 0); // Using Arrow Function (_=>_) to filter out the odd numbers (Shortcut)

// let drr = arr.filter(ele => ele > 5); // Using Arrow Function (_=>_) to filter out the numbers greater than 5 (Shortcut)

// let err = arr.filter(ele => (ele < 5) ? true : false); // Using Arrow Function (_=>_) to filter out the numbers less than 5 (Shortcut)

// console.log(`Original Array : ${arr}`);
// console.log(brr);
// console.log(crr);
// console.log(drr);
// console.log(err);

// // let frr = [...arr] uses the spread operator [...] to create a copy of arr before sorting it.

// let frr = [...arr].sort((a, b) => a - b); // Create a copy of arr and sort it in ascending order
// let grr = [...arr].sort((a, b) => b - a); // Create a copy of arr and sort it in descending order

// console.log(frr); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// console.log(grr); // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

// let hrr = [0, 9, -2, 7, 1, -10, 3, -9]; // Array of numbers

// let irr = hrr.sort((a, b) => Math.abs(a) - Math.abs(b)); // Sort the array based on absolute values

// let jrr = hrr.sort((a, b) => a - b); // Sort the array in ascending order

// console.log(irr); // Output: [0, 1, -2, 3, -9, 7, 9, -10]
// console.log(jrr);



// let count50_59 = 0;
// let count60_69 = 0;
// let count70_79 = 0;
// let count80_89 = 0;
// let count90_100 = 0; 

// for (let i = 0; i < 20; i++) {
//     let min = 50;
//     let max = 100;
//     let random = Math.floor(Math.random() * (max - min + 1)) + min;
//     console.log(random);  // This will give a random number between 50 and 100

//     if (random >= 50 && random <= 59) count50_59++;
//     else if (random >= 60 && random <= 69) count60_69++;
//     else if (random >= 70 && random <= 79) count70_79++;
//     else if (random >= 80 && random <= 89) count80_89++;
//     else if (random >= 90 && random <= 100) count90_100++;
// }

// console.log(`50-59: ${count50_59}`);
// console.log(`60-69: ${count60_69}`);
// console.log(`70-79: ${count70_79}`);
// console.log(`80-89: ${count80_89}`);
// console.log(`90-100: ${count90_100}`);

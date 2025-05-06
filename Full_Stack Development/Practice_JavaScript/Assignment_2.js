// Source:
const readline = require('readline');

// Create instance of readline
const rl = readline.createInterface({
    // Read from the input stream
    input: process.stdin,
    // Write to the output stream
    output: process.stdout
});

// Ask the user to enter two numbers
rl.question("Enter the first name: ", (num1) => {
    // Ask the user to enter the second number
    rl.question("Enter the second name: ", (num2) => {
        // Calculate the sum of two numbers
        const sum = parseFloat(num1) + parseFloat(num2);

        // Print the sum
        console.log(`\nAddition of ${num1} and ${num2} is: ${sum}`);

        // Close the readline instance
        rl.close();
    });
});
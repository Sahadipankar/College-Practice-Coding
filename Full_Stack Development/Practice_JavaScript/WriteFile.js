const fs = require ('fs');
fs.writeFile ("Test.txt", "Hello, I am writing this text to a file using NodeJS", (err) => {
    if (err) throw err;
    console.log ("\nFile has been written successfully");
});

// In cmd, run the following command to execute the file
// Go to the directory where the file is saved and run the following command
// node ./WriteFile.js
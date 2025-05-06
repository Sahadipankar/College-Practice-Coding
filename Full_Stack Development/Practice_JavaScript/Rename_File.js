const fs = require ('fs');

fs.rename ("./Test.txt", "./New_Test.js", (err) => {
    if (err) throw err;
    console.log ("\nFile has been renamed successfully");
});
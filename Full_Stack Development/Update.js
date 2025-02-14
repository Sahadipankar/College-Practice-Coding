const fs = require ('fs');

fs.appendFile ("Test.txt", "\n100", (err) => {
    if (err) throw err;
    console.log ("\nFile has been updated successfully");
});
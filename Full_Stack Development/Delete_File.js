const fs = require ('fs');

fs.unlink ("Test.txt", (err) => {
    if (err) throw err;
    console.log ("\nFile has been Deleted successfully");
});
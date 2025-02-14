<?php
// // Function to check if a number is odd or even
// function checkOddEven($num) {
//     if ($num % 2 == 0) {
//         echo "$num is an Even number.";
//     } else {
//         echo "$num is an Odd number.";
//     }
// }

// // Example usage
// $number = 2; // Change this number to test
// checkOddEven($number);


$x = 4;
($x % 2 == 0) ? print "$x is an Even number." : print "$x is an Odd number."; // print is slower than echo
echo "<br>";
echo ($x % 2 == 0) ? "$x is an Even number." : "$x is an Odd number."; // echo is faster than print
?>
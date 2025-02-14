<?php
$x = 2;
while ($x <= 20) {
    $flag = false;
    $y = 2;

    while ($y < $x) {
        if ($x % $y == 0) {
            $flag = true;
            break; // Exit loop once a divisor is found
        }
        $y++;
    }

    if ($flag == true) {
        echo "$x is not prime<br>";
    } else {
        echo "$x <b>is prime</b><br>";
    }
    $x++;
}
?>
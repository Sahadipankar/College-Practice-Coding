<?php
    $submit = false;
    if(isset($_POST['name'])) {

        $server = "localhost:3307";
        $username = "root";
        $password = "";

        $con = mysqli_connect($server, $username, $password);

        if (!$con) {
            die("Connection to this Database failed due to : " . mysqli_connect_error());
        }

        // echo "Success connecting to the Database"; // This is for testing purposes = $_POST[''];]

        $name = $_POST['name'];
        $age = $_POST['age'];
        $email = $_POST['email'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $city = $_POST['city'];
        $otherInfo = $_POST['otherInfo'];

        $sql = "INSERT INTO `us_trip`.`trip` (`Name`, `Age`, `Email`, `Phone`, `Address`, `City`, `Other Information`, `Date`) VALUES ('$name', '$age', '$email', '$phone', '$address', '$city', '$otherInfo', current_timestamp());";

        // echo $sql;   // This is for testing purposes

        if ($con->query($sql) == true) {
            $submit = true;
            // echo "Successfully inserted";
        } else {
            echo "ERROR: $sql <br> $con->error";
        }

        $con->close();
    }
?>






<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Travel Form</title>
    <link href="https://fonts.googleapis.com/css2?family=Sriracha&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <img src="bg.webp" alt="Brainware University" class="bg">
    <div class="container">
        <h1>Welcome to Brainware University US Trip Form</h1>
        <p>Enter your details and submit this form to confirm your participation in the trip</p>
        
        <?php
        if($submit == true) {
            echo "<p class='submitMsg'>Thank you for submitting your form. We look forward to see you and will be in touch with you soon.</p>";
        }
        ?>

        <form action="index.php" method="post">
            <input type="text" name="name" id="name" placeholder="Enter your name" required>
            <input type="number" name="age" id="age" placeholder="Enter your age" required>
            <input type="text" name ="email" id="email" placeholder="Enter your email" required>
            <input type="number" name="phone" id="phone" placeholder="Enter your phone" required>
            <input type="text" name="address" id="address" placeholder="Enter your address" required>
            <input type="text" name="city" id="city" placeholder="Enter your city" required>
            <textarea name="otherInfo" id="otherInfo" cols="30" rows="5" placeholder="Enter any other information here"></textarea>
            <button class="btn">Submit</button>
        </form>
    </div>
    </body>
</html>
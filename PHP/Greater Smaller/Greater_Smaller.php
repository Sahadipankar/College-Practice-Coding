<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result</title>
    <link rel="stylesheet" href="Greater_Smaller.css"> <!-- Linking external CSS -->
</head>

<body>
    <div class="container">
        <h1>Result</h1>
        
        <?php   
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            if (isset($_POST['num1']) && isset($_POST['num2'])) {
                $num1 = floatval($_POST['num1']);
                $num2 = floatval($_POST['num2']);

                echo '<div class="result">';
                if ($num1 > $num2) {
                    echo "<p class='greater'>$num1 is greater than $num2</p>";
                } elseif ($num1 < $num2) {
                    echo "<p class='smaller'>$num1 is smaller than $num2</p>";
                } else {
                    echo "<p class='equal'>$num1 is equal to $num2</p>";
                }
                echo '</div>';
            }
        }
        ?>
        <a href="Greater_Smaller.html" class="back-button">Go Back</a>
    </div>
</body>

</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Number Guessing Game</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="container">
        <h1>Number Guessing Game</h1>
        <p>Guess the number between <strong>1</strong> and <strong>100</strong>!</p>

        <form method="POST">
            <input type="number" name="guess" placeholder="Enter your guess" min="1" max="100" required>
            <input type="submit" value="Submit">
        </form>

        <?php
        session_start();

        // Initialize game if not already set
        if (!isset($_SESSION["target_number"])) {
            $_SESSION["target_number"] = rand(1, 100); // Generate a random number
            $_SESSION["attempts"] = 0; // Track number of attempts
        }

        // Check if a guess is submitted
        if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["guess"])) {
            $guess = intval($_POST["guess"]); // Convert input to an integer
            $_SESSION["attempts"]++; // Increment attempts

            // Compare guess with target number
            if ($guess == $_SESSION["target_number"]) {
                echo "<p class='success'>🎉 Congratulations! You guessed the correct number <strong>{$guess}</strong> in <strong>{$_SESSION["attempts"]}</strong> tries.</p>";
                session_destroy(); // Reset the game
                echo "<a href='index.php' class='restart-btn'>Play Again</a>";
            } elseif ($guess < $_SESSION["target_number"]) {
                echo "<p class='hint'>📉 Too low! Try again.</p>";
            } else {
                echo "<p class='hint'>📈 Too high! Try again.</p>";
            }
        }
        ?>
    </div>

</body>
</html>

package com.kuzey

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))

// create a new random number between 1-100
int randomNumber = new Random().nextInt(100) + 1
// player's guess
int guess = 0
// number of attempts that the player has
int attempts = 0

println "Welcome to the number guessing game!"
println "I'm thinking of a number between 1 and 100."

while (guess != randomNumber && attempts < 10) {
    print "Take a guess: "

    try {
        guess = Integer.parseInt(reader.readLine())
    } catch (NumberFormatException e) {
        println "Please enter a valid number."
        continue
    }

    attempts++

    if (guess < randomNumber) {
        println "Too low! Try a higher number."
    } else if (guess > randomNumber) {
        println "Too high! Try a lower number."
    }
}

if (attempts == 10) {
    println "You got 10 attempts !GAME OVER!"
} else {
    println "Congratulations! You guessed the right number in $attempts attempts."
}

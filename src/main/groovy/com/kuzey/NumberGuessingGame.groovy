package com.kuzey

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))

int randomNumber = new Random().nextInt(100) + 1
int guess = 0
int attempts = 0

println "Welcome to the number guessing game!"
println "I'm thinking of a number between 1 and 100."

while (guess != randomNumber) {
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

println "Congratulations! You guessed the right number in $attempts attempts."

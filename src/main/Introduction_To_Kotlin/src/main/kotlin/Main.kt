package org.example
// Global
var total = 0


fun main() {
    printMenu()
    readInput()
}

fun printMenu() {
    println("Please select which item you'd like to your cart:")
    println("\t[1] Abraxo Cleaner\t\t\t\t\t\t\t 5$")
    println("\t[2] Flight to the Googleplex in California\t 350$")
    println("\t[3] Keyboard + Mouse\t\t\t\t\t\t 150$")
    println("\t[4] Unlimited Holidays\t\t\t\t\t\t 200$")
    println("\t[5] Exit")
    println("Please provide your input.")
    print("> ")
}

fun readInput() {
    var moveOn = true

    while (moveOn) {
        // Break the loop by default
        moveOn = false

        // Get input from user
        val option = readln()

        // Validate option 1
        if (option.contains(regex = Regex("(1)|(\\[1])"))) {
            moveOn = true
            total += 5
            println("Abraxo Cleaner added!")
            printMenu()
        }

        // Validate option 2
        if (option.contains(regex = Regex("(2)|(\\[2])"))) {
            moveOn = true
            total += 350
            println("Flight added!")
            printMenu()
        }

        // Validate option 3
        if (option.contains(regex = Regex("(3)|(\\[3])"))) {
            moveOn = true
            total += 150
            println("Gear added!")
            printMenu()
        }

        // Validate option 4
        if (option.contains(regex = Regex("(4)|(\\[4])"))) {
            moveOn = true
            total += 200
            println("Holidays added!")
            printMenu()
        }

        // Validate option 5 - exit
        if (option.contains(regex = Regex("(5)|(\\[5])"))) {
            moveOn = false
            println("Alright, thanks. Your total checkout is: $total$. Goodbye!")
        }
    }


}
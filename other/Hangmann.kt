package other

import java.util.Scanner
import kotlin.random.Random

fun main() {
    word()
}

fun word() {
    val scanner = Scanner(System.`in`)
    println("Enter a word:")
    val userInput = scanner.nextLine()
    println("You entered: $userInput")

    val (modifiedString, replacedCharacters, originalString) = randomLetter(userInput)
    println("Modified word: $modifiedString")

    clearConsole()

    guess(replacedCharacters, originalString, modifiedString)

    scanner.close()
}

fun randomLetter(input: String): Triple<String, List<Pair<Char, Int>>, String> {
    val numCharsToReplace = input.length / 2
    val indicesToReplace = mutableSetOf<Int>()

    while (indicesToReplace.size < numCharsToReplace) {
        indicesToReplace.add(Random.nextInt(input.length))
    }

    val replacedCharacters = mutableListOf<Pair<Char, Int>>()

    val modifiedString = input.mapIndexed { index, char ->
        if (index in indicesToReplace) {
            replacedCharacters.add(char to index)
            '_'
        } else {
            char
        }
    }.joinToString("")

    return Triple(modifiedString, replacedCharacters, input)
}

fun guess(replacedChars: List<Pair<Char, Int>>, originalString: String, modifiedString: String) {
    val scanner = Scanner(System.`in`)
    var currentModifiedString = modifiedString

    var remainingGuesses = replacedChars.size
    while (remainingGuesses > 0) {
        println("Current word: $currentModifiedString")
        println("Take a guess (enter a letter):")
        val userInput = scanner.nextLine()

        if (userInput.length == 1 && userInput[0] in originalString) {
            val guessedLetter = userInput[0]

            val updatedModifiedString = currentModifiedString.toCharArray()

            for (pair in replacedChars) {
                if (pair.first == guessedLetter) {
                    updatedModifiedString[pair.second] = guessedLetter
                }
            }

            currentModifiedString = updatedModifiedString.joinToString("")

            remainingGuesses -= replacedChars.count { it.first == guessedLetter }

            println("Good job! You've revealed a letter.")
        } else {
            println("Bad job! Try again.")
        }
    }

    println("Congratulations! You've guessed the word: $currentModifiedString")
    scanner.close()
}

/*
fun clearConsole() { //funktioniert nicht weil nicht cmd sondern andere console
    try {
        val os = System.getProperty("os.name")
        if (os.contains("Windows", ignoreCase = true)) {
            Runtime.getRuntime().exec("cls")
        }
    } catch (e: Exception) {
        println("Error clearing console: ${e.message}")
    }
}
 */

fun clearConsole() {
    repeat(50) { println() }  // Prints 50 blank lines
}



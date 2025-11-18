package leetcode._3136

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.isValid(word)

    if (output) {
        println("$word is a valid word")
    } else {
        println("$word is not a valid word")
    }
}
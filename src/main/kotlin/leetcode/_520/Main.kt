package leetcode._520

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.detectCapitalUse(word)

    if (output) {
        println("The word is a capital")
    } else {
        println("The word is not a capital")
    }
}
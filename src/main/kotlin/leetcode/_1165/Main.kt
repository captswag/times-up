package leetcode._1165

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the characters in keyboard: ")
    val keyboard = scanner.next()

    print("Enter the word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.calculateTime(keyboard, word)

    println("The time taken to type $word is: $output")
}
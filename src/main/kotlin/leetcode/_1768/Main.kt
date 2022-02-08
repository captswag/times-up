package leetcode._1768

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word 1: ")
    val word1 = scanner.next()

    print("Enter the word 2: ")
    val word2 = scanner.next()

    val solution = Solution()
    val output = solution.mergeAlternatively(word1, word2)

    println("The final string after merging is: $output")
}
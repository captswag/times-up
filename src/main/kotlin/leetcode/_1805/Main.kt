package leetcode._1805

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.numDifferentIntegers(word)

    println("The number of unique different integers in $word is: $output")
}
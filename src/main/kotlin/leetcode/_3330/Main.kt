package leetcode._3330

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.possibleStringCount(word)

    println("The total number of possible original strings that Alice might have intended to type is $output")
}
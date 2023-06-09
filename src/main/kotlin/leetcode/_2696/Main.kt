package leetcode._2696

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.minLength(s)

    println("Minimum string length after removing substrings is: $output")
}
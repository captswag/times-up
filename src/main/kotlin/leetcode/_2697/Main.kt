package leetcode._2697

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.makeSmallestPalindrome(s)

    println("Lexicographically smallest palindrome is: $output")
}
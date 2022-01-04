package leetcode._409

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.longestPalindrome(s)

    println("The length of the longest palindrome is: $output")
}
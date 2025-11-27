package leetcode._1021

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.removeOuterParentheses(s)

    println("After removing outer parentheses of each part, resultant string is $output")
}
package leetcode._2609

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.findTheLongestBalancedSubstring(s)

    println("Longest balanced substring is $output")
}
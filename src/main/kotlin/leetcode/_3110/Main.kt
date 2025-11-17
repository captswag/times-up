package leetcode._3110

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.scoreOfString(s)

    println("The score of $s would be $output")
}
package leetcode._1544

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.makeGood(s)

    println("The string after making $s good is: $output")
}
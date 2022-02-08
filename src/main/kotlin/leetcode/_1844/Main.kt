package leetcode._1844

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.replaceDigits(s)

    println("The string after replacing digits is: $output")
}
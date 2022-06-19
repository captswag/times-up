package leetcode._1446

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxPower(s)

    println("The max power of the given string is: $output")
}
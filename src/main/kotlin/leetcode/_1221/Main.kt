package leetcode._1221

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.balancedStringSplit(s)

    println("The maximum amount of split balanced string is: $output")
}
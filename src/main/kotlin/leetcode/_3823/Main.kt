package leetcode._3823

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.reverseByType(s)

    println("The string after performing the reversals is: $output")
}
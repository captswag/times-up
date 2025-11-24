package leetcode._3174

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.clearDigits(s)

    println("The resulting string after removing all digits is $output")
}
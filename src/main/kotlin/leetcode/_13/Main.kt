package leetcode._13

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.romanToInt(s)

    println("The roman to integer value of $s is: $output")
}
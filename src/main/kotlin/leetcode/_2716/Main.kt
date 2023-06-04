package leetcode._2716

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.minimizedStringLength(s)

    println("The length of the minimized string is: $output")
}
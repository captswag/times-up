package leetcode._434

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.countSegments(s)

    println("The number of segments in the given string is: $output")
}
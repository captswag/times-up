package leetcode._3114

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.findLatestTime(s)

    println("The latest time is $output")
}
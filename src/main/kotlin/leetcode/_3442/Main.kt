package leetcode._3442

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value for s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxDifference(s)

    println("Maximum difference is $output")
}
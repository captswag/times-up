package leetcode._1422

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxScore(s)

    println("Maximum score after splitting $s is: $output")
}
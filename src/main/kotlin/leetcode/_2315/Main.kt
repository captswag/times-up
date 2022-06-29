package leetcode._2315

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.countAsterisks(s)

    println("Count of asterisks: $output")
}
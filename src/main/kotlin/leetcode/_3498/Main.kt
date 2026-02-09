package leetcode._3498

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.reverseDegree(s)

    println("The reverse degree is: $output")
}
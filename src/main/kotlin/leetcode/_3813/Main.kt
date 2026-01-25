package leetcode._3813

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.vowelConsonantScore(s)

    println("The score of the string is: $output")
}
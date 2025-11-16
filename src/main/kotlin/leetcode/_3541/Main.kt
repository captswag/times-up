package leetcode._3541

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxFreqSum(s)

    println("The sum of the two frequencies is: $output")
}
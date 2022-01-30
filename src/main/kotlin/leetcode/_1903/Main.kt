package leetcode._1903

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.next()

    val solution = Solution()
    val output = solution.largestOddNumber(n)

    println("The largest odd number is: $output")
}
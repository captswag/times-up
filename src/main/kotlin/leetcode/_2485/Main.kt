package leetcode._2485

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.pivotInteger(n)

    println("The pivot integer is $output")
}
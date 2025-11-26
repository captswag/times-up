package leetcode._3754

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.sumAndMultiply(n)

    println("The value of x * sum is $output")
}
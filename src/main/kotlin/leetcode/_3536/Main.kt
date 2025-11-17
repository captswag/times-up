package leetcode._3536

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.maxProduct(n)

    println("Maximum product of two digits is $output")
}
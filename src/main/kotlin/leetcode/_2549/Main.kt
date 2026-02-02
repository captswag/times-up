package leetcode._2549

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.distinctIntegers(n)

    println("Number of distinct integers present on the board is: $output")
}
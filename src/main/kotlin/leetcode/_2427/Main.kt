package leetcode._2427

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of a: ")
    val a = scanner.nextInt()

    print("Enter the value of b: ")
    val b = scanner.nextInt()

    val solution = Solution()
    val output = solution.commonFactors(a, b)

    println("The number of common factors are: $output")
}
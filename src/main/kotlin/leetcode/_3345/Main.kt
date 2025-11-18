package leetcode._3345

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the value of t: ")
    val t = scanner.nextInt()

    val solution = Solution()
    val output = solution.smallestNumber(n, t)

    println("Smallest divisible digit product is $output")
}
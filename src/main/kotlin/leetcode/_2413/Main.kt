package leetcode._2413

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.smallestEvenMultiple(n)

    println("Smallest even multiple of $n is: $output")
}
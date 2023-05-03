package leetcode._2544

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.alternateDigitSum(n)

    println("Alternating digit sum is: $output")
}
package leetcode._1137

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.tribonacci(n)

    println("The tribonacci number at $n is: $output")
}
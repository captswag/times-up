package leetcode._3622

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.checkDivisibility(n)

    if (output) {
        println("$n is divisible by the sum plus product")
    } else {
        println("$n is not divisible by the sum plus product")
    }
}
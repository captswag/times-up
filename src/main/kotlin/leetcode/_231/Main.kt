package leetcode._231

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.isPowerOfTwo(n)

    if (output) {
        println("$n is a power of 2")
    } else {
        println("$n is not a power of 2")
    }
}
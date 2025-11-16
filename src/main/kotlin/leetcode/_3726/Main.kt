package leetcode._3726

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextLong()

    val solution = Solution()
    val output = solution.removeZeros(n)

    println("After removing all zeroes from $n, we get $output")
}
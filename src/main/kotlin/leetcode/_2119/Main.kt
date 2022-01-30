package leetcode._2119

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.isSameAfterReversal(n)

    if (output) {
        println("The number is the same after double reversal")
    } else {
        println("The number is not the same after double reversal")
    }
}
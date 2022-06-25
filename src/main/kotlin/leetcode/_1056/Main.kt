package leetcode._1056

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.confusingNumber(n)

    if (output) {
        println("$n is a confusing number")
    } else {
        println("$n is not a confusing number")
    }
}
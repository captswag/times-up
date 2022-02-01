package leetcode._202

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.isHappy(n)

    if (output) {
        println("$n is a happy number")
    } else {
        println("$n is not a happy number")
    }
}
package leetcode._367

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number to be checked for perfect square: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.isPerfectSquare(num)

    if (output) {
        println("$num is a perfect square")
    } else {
        println("$num is not a perfect square")
    }
}
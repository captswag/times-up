package leetcode._507

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.checkPerfectNumber(num)

    if (output) {
        println("$num is a perfect number")
    } else {
        println("$num is not a perfect number")
    }
}
package leetcode._2283

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string num: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.digitCount(num)

    if (output) {
        println("The number has equal digit count and digit value")
    } else {
        println("The number doesn't have equal digit count and digit value")
    }
}
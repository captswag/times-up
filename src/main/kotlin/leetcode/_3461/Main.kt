package leetcode._3461

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.hasSameDigits(s)

    if (output) {
        println("Digits are equal in string after operations")
    } else {
        println("Digits are not equal in string after operations")
    }
}
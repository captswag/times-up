package leetcode._246

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.isStrobogrammatic(num)

    if (output) {
        println("$num is a strobogrammatic number")
    } else {
        println("$num is not a strobogrammatic number")
    }
}
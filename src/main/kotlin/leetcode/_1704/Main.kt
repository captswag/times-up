package leetcode._1704

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.halvesAreAlike(s)

    if (output) {
        println("The two halves are alike")
    } else {
        println("The two halves aren't alike")
    }
}
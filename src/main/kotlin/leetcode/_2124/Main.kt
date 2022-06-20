package leetcode._2124

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.checkString(s)

    if (output) {
        println("All a's appear before b's")
    } else {
        println("All a's don't appear before b's")
    }
}
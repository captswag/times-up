package leetcode._844

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the string t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.backspaceCompare(s, t)

    if (output) {
        println("The two strings are the same")
    } else {
        println("The two strings are not the same")
    }
}
package leetcode._20

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.isValid(s)

    if (output) {
        println("The parenthesis $s is valid")
    } else {
        println("The parenthesis $s is invalid")
    }
}
package leetcode._3340

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string num: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.isBalanced(num)

    if (output) {
        println("The given string is balanced.")
    } else {
        println("The given string is not balanced.")
    }
}
package leetcode._125

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.isPalindrome(s)

    if (output) {
        println("The string is a palindrome")
    } else {
        println("The string is not a palindrome")
    }
}
package leetcode._680

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.validPalindrome(s)

    if (output) {
        println("The given string $s is a palindrome")
    } else {
        println("The given string $s is not a palindrome")
    }
}
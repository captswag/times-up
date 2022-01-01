package leetcode._266

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.canPermutePalindrome(s)

    if (output) {
        println("$s can be a palindrome")
    } else {
        println("$s cannot be a palindrome")
    }
}
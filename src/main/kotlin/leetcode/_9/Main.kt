package leetcode._9

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number x: ")
    val x = scanner.nextInt()

    val solution = Solution()
    val output = solution.isPalindrome(x)

    if (output) {
        println("The number $x is a palindrome")
    } else {
        println("The number $x is not a palindrome")
    }
}
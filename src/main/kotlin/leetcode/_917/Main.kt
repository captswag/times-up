package leetcode._917

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.reverseOnlyLetters(s)

    println("The string after reversing the alphabets is: $output")
}
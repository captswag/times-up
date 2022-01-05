package leetcode._557

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.reverseWords(s)

    println("The string after reversing is: $output")
}
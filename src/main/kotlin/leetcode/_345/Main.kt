package leetcode._345

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.reverseVowels(s)

    println("The string after reversing vowels is: $output")
}
package leetcode._1180

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.countLetters(s)

    println("The count of substrings with only one distinct character is: $output")
}
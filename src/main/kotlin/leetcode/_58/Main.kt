package leetcode._58

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.lengthOfLastWord(s)

    println("The length of the last word is: $output")
}
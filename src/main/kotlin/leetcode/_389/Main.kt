package leetcode._389

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the first string s: ")
    val s = scanner.next()

    print("Enter the second string t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.findTheDifference(s, t)

    println("The diff b/w the two strings is: $output")
}
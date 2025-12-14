package leetcode._3216

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.getSmallestString(s)

    println("The lexicographically smallest string is $output")
}
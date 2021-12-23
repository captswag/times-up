package leetcode._28

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the value of the haystack: ")
    val haystack = scanner.next()

    print("Enter the value of the needle: ")
    val needle = scanner.next()

    val solution = Solution()
    val output = solution.strStr(haystack, needle)
    println("strStr: $output")
}
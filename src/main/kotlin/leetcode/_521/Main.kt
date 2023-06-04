package leetcode._521

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of a: ")
    val a = scanner.next()

    print("Enter the value of b: ")
    val b = scanner.next()

    val solution = Solution()
    val output = solution.findLUSlength(a, b)

    println("The length of the longest uncommon subsequence is: $output")
}
package leetcode._3019

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.countKeyChanges(s)

    println("Number of changing keys is: $output")
}
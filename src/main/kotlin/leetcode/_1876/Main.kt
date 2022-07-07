package leetcode._1876

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.countGoodSubstrings(s)

    println("The number of good substrings of length 3 is: $output")
}
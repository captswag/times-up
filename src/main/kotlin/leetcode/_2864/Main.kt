package leetcode._2864

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maximumOddBinaryNumber(s)

    println("The maximum odd binary number that can be created from the given combination is: $output")
}
package leetcode._171

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the column title: ")
    val columnTitle = scanner.next()

    val solution = Solution()
    val output = solution.titleToNumber(columnTitle)

    println("The corresponding column number is $output")
}
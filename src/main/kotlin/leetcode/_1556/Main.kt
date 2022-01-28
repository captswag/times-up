package leetcode._1556

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.thousandSeparator(n)

    println("The number after formatting is: $output")
}
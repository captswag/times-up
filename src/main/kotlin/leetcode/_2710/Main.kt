package leetcode._2710

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of num: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.removeTrailingZeros(num)

    println("The string after removing trailing zeroes is: $output")
}
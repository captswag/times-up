package leetcode._2264

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the num: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.largestGoodInteger(num)

    println("The largest good number is: $output")
}
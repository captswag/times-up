package leetcode._1118

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the year: ")
    val year = scanner.nextInt()

    print("Enter the month: ")
    val month = scanner.nextInt()

    val solution = Solution()
    val output = solution.numberOfDays(year, month)

    println("The number of days in the given month is: $output")
}
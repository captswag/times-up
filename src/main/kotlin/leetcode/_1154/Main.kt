package leetcode._1154

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the date: ")
    val date = scanner.next()

    val solution = Solution()
    val output = solution.dayOfYear(date)

    println("The day of the year is: $output")
}
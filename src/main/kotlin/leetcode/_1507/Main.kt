package leetcode._1507

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the date: ")
    val date = scanner.nextLine()

    val solution = Solution()
    val output = solution.reformatDate(date)

    println("Date after reformatting is: $output")
}
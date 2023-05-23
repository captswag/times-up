package leetcode._1185

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the day: ")
    val day = scanner.nextInt()

    print("Enter the month: ")
    val month = scanner.nextInt()

    print("Enter the year: ")
    val year = scanner.nextInt()

    val solution = Solution()
    val output = solution.dayOfTheWeek(day, month, year)

    println("The day of the week is: $output")
}
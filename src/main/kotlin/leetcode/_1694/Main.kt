package leetcode._1694

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val number = scanner.nextLine()

    val solution = Solution()
    val output = solution.reformatNumber(number)

    println("The number after formatting is: $output")
}
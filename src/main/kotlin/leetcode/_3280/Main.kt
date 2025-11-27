package leetcode._3280

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string date: ")
    val date = scanner.next()

    val solution = Solution()
    val output = solution.convertDateToBinary(date)

    println("Binary representation of $date is $output")
}
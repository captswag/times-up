package leetcode._119

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the row: ")
    val row = scanner.nextInt()

    val solution = Solution()
    val output = solution.getRow(row)

    output.displayFormatted()
}
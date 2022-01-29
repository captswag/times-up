package leetcode._118

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of numRows: ")
    val numRows = scanner.nextInt()

    val solution = Solution()
    val output = solution.generate(numRows)

    for (row in output) {
        row.displayFormatted()
    }
}
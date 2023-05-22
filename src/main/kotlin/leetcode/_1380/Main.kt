package leetcode._1380

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the row size: ")
    val rowSize = scanner.nextInt()

    print("Enter the column size: ")
    val columnSize = scanner.nextInt()

    val matrix = Array(rowSize) { IntArray(columnSize) }
    for (rowIndex in matrix.indices) {
        println("Row $rowIndex")
        for (columnIndex in matrix[0].indices) {
            print("Enter the value at column $columnIndex: ")
            matrix[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.luckyNumbers(matrix)

    output.displayFormatted()
}
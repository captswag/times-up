package leetcode._867

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rowSize = scanner.nextInt()

    print("Enter the number of columns: ")
    val columnSize = scanner.nextInt()

    val matrix = Array(rowSize) { IntArray(columnSize) }
    for (rowIndex in matrix.indices) {
        print("Row: $rowIndex")
        for (columnIndex in matrix[rowIndex].indices) {
            print("Enter the value in column $columnIndex: ")
            matrix[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.transpose(matrix)

    for (rowIndex in output.indices) {
        println("Row: $rowIndex")
        output[rowIndex].displayFormatted()
    }
}
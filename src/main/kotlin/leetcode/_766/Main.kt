package leetcode._766

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rows = scanner.nextInt()

    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    val matrix = Array(rows) { IntArray(columns) }
    for (rowIndex in matrix.indices) {
        println("Row: $rowIndex")
        for (columnIndex in matrix[rowIndex].indices) {
            print("Enter the value at column $columnIndex: ")
            matrix[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.isToeplitzMatrix(matrix)

    if (output) {
        println("The given matrix is a toeplitz matrix")
    } else {
        println("The given matrix is not a toeplitz matrix")
    }
}
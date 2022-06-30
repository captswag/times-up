package leetcode._2133

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val matrix = Array(size) { IntArray(size) }
    for (rowIndex in matrix.indices) {
        println("Row: $rowIndex")
        for (columnIndex in matrix[rowIndex].indices) {
            print("Enter the value at column $columnIndex: ")
            matrix[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.checkValid(matrix)

    if (output) {
        println("Every row and column contains all the integers from 1 to $size")
    } else {
        println("It's not a valid matrix")
    }
}
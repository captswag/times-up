package leetcode._2319

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the matrix: ")
    val size = scanner.nextInt()

    val grid = Array(size) { IntArray(size) }
    for (rowIndex in grid.indices) {
        println("Row: $rowIndex")
        for (columnIndex in grid[rowIndex].indices) {
            print("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.checkXMatrix(grid)

    if (output) {
        println("The given matrix is a X-Matrix")
    } else {
        println("The given matrix is not a X-Matrix")
    }
}
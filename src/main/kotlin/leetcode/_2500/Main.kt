package leetcode._2500

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rowSize = scanner.nextInt()

    print("Enter the number of columns: ")
    val columnSize = scanner.nextInt()

    val grid = Array(rowSize) { IntArray(columnSize) }
    for (rowIndex in grid.indices) {
        println("Row: $rowIndex")
        for (columnIndex in grid[0].indices) {
            print("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.deleteGreatestValue(grid)

    println("The sum of the maximum deleted values of each row is: $output")
}
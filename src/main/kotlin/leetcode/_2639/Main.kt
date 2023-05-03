package leetcode._2639

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rows = scanner.nextInt()

    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    val grid = Array(rows) { IntArray(columns) }
    for (rowIndex in grid.indices) {
        println("Row: $rowIndex")
        for (columnIndex in grid[0].indices) {
            print("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.findColumnWidth(grid)

    output.displayFormatted()
}
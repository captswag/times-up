package leetcode._463

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rows = scanner.nextInt()

    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    val grid = Array(rows) { IntArray(columns) }
    for (rowIndex in 0 until rows) {
        println("Row: $rowIndex")
        for (columnIndex in 0 until columns) {
            print("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.islandPerimeter(grid)

    println("The perimeter of the island is: $output")
}
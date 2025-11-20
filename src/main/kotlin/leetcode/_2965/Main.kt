package leetcode._2965

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the two dimensional array: ")
    val size = scanner.nextInt()

    val grid = Array(size) { IntArray(size) }
    for (rowIndex in grid.indices) {
        println("Row: $rowIndex")
        for (columnIndex in grid[rowIndex].indices) {
            println("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.findMissingAndRepeatedValues(grid)

    output.displayFormatted()
}
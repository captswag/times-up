package leetcode._200

import leetcode._200.solutiondfs.SolutionDfs
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rows = scanner.nextInt()

    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    val grid = Array(rows) { CharArray(columns) }
    for (rowIndex in 0 until rows) {
        println("Rows: $rowIndex")
        for (columnIndex in 0 until columns) {
            print("Enter the value at column $columnIndex: ")
            grid[rowIndex][columnIndex] = scanner.next()[0]
        }
    }

    val solution: Solution = SolutionDfs()
    val output = solution.numIslands(grid)

    println("The number of islands is: $output")
}
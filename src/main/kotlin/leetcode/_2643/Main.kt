package leetcode._2643

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val rows = scanner.nextInt()

    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    val mat = Array(rows) { IntArray(columns) }
    for (rowIndex in mat.indices) {
        println("Row: $rowIndex")
        for (columnIndex in mat[0].indices) {
            print("Enter the value at column $columnIndex: ")
            mat[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.rowAndMaximumOnes(mat)

    output.displayFormatted()
}
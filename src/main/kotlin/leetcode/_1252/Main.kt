package leetcode._1252

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter row size: ")
    val rowSize = scanner.nextInt()

    print("Enter column size: ")
    val columnSize = scanner.nextInt()

    print("Enter the size: ")
    val size = scanner.nextInt()

    val indices = Array(size) { IntArray(2) }
    for (index in indices.indices) {
        print("Index: $index")
        print("Enter the row index: ")
        val rowIndex = scanner.nextInt()
        print("Enter the column index: ")
        val columnIndex = scanner.nextInt()
        indices[index] = intArrayOf(rowIndex, columnIndex)
    }

    val solution = Solution()
    val output = solution.oddCells(rowSize, columnSize, indices)

    println("The number of cells with odd values is: $output")
}
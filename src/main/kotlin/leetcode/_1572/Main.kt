package leetcode._1572

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the matrix: ")
    val size = scanner.nextInt()

    val mat = Array(size) { IntArray(size) }
    for (rowIndex in mat.indices) {
        println("Row: $rowIndex")
        for (columnIndex in 0 until mat[0].size) {
            print("Enter the value at column $columnIndex: ")
            mat[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.diagonalSum(mat)

    println("Diagonal sum: $output")
}
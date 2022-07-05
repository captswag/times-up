package leetcode._832

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the matrix: ")
    val size = scanner.nextInt()

    val image = Array(size) { IntArray(size) }
    for (rowIndex in image.indices) {
        println("Row: $rowIndex")
        for (columnIndex in image[0].indices) {
            print("Enter the value at column $columnIndex: ")
            image[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.flipAndInvertImage(image)

    for (rowIndex in output.indices) {
        println("Row: $rowIndex")
        output[rowIndex].displayFormatted()
    }
}
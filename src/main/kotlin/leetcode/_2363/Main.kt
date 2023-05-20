package leetcode._2363

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the row size of array 1: ")
    val rowSize1 = scanner.nextInt()

    val items1 = Array(rowSize1) { IntArray(2) }
    for (rowIndex in items1.indices) {
        println("Row: $rowIndex")
        for (columnIndex in items1[0].indices) {
            print("Enter the value at column $columnIndex: ")
            items1[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    print("Enter the row size of array 2: ")
    val rowSize2 = scanner.nextInt()

    val items2 = Array(rowSize2) { IntArray(2) }
    for (rowIndex in items2.indices) {
        println("Row: $rowIndex")
        for (columnIndex in items2[0].indices) {
            print("Enter the value at column $columnIndex: ")
            items2[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.mergeSimilarItems(items1, items2)

    for (index in output.indices) {
        print("Index $index: ")
        output[index].displayFormatted()
    }
}
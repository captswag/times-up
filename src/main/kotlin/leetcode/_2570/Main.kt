package leetcode._2570

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the row size of array 1: ")
    val rowSize1 = scanner.nextInt()

    val nums1 = Array(rowSize1) { IntArray(2) }
    for (rowIndex in nums1.indices) {
        println("Row: $rowIndex")
        for (columnIndex in nums1[0].indices) {
            print("Enter the value at column $columnIndex: ")
            nums1[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    print("Enter the row size of array 2: ")
    val rowSize2 = scanner.nextInt()

    val nums2 = Array(rowSize2) { IntArray(2) }
    for (rowIndex in nums2.indices) {
        println("Row: $rowIndex")
        for (columnIndex in nums2[0].indices) {
            print("Enter the value at column $columnIndex: ")
            nums2[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.mergeArrays(nums1, nums2)

    for (index in output.indices) {
        print("Index $index: ")
        output[index].displayFormatted()
    }
}
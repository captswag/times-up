package leetcode._2248

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val row = scanner.nextInt()

    print("Enter the number of columns: ")
    val column = scanner.nextInt()

    val nums = Array(row) { IntArray(column) }
    for (rowIndex in nums.indices) {
        println("Row: $rowIndex")
        for (columnIndex in nums[rowIndex].indices) {
            print("Enter the value at column $columnIndex: ")
            nums[rowIndex][columnIndex] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.intersection(nums)

    output.displayFormatted()
}
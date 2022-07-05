package leetcode._2022

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val original = IntArray(size)
    for (index in original.indices) {
        print("Enter the value at index $index: ")
        original[index] = scanner.nextInt()
    }

    print("Enter the value of m: ")
    val m = scanner.nextInt()

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.construct2DArray(original, m, n)

    for (rowIndex in output.indices) {
        println("Row: $rowIndex")
        output[rowIndex].displayFormatted()
    }
}
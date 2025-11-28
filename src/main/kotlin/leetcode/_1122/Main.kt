package leetcode._1122

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first array: ")
    val size1 = scanner.nextInt()

    val arr1 = IntArray(size1)
    for (index in arr1.indices) {
        print("Enter the value at index $index: ")
        arr1[index] = scanner.nextInt()
    }

    print("Enter the size of the second array: ")
    val size2 = scanner.nextInt()

    val arr2 = IntArray(size2)
    for (index in arr2.indices) {
        print("Enter the value at index $index: ")
        arr2[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.relativeSortArray(arr1, arr2)

    output.displayFormatted()
}
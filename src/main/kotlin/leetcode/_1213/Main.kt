package leetcode._1213

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter size of array 1: ")
    val size1 = scanner.nextInt()

    val arr1 = IntArray(size1)
    for (index in arr1.indices) {
        print("Enter the value at index $index: ")
        arr1[index] = scanner.nextInt()
    }

    print("Enter the size of array 2: ")
    val size2 = scanner.nextInt()

    val arr2 = IntArray(size2)
    for (index in arr2.indices) {
        print("Enter the value at index $index: ")
        arr2[index] = scanner.nextInt()
    }

    print("Enter the size of array 3: ")
    val size3 = scanner.nextInt()

    val arr3 = IntArray(size3)
    for (index in arr3.indices) {
        print("Enter the value at index $index: ")
        arr3[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.arraysIntersection(arr1, arr2, arr3)

    output.displayFormatted()
}
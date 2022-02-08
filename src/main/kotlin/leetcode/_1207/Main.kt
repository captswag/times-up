package leetcode._1207

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val arr = IntArray(size)
    for (index in arr.indices) {
        print("Enter the value at index $index: ")
        arr[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.uniqueOccurrences(arr)

    if (output) {
        println("Each number has an unique number of occurrence")
    } else {
        println("Each number doesn't have an unique number of occurrence")
    }
}
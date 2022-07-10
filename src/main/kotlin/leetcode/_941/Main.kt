package leetcode._941

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
    val output = solution.validMountainArray(arr)

    if (output) {
        println("The given array is a valid mountain array")
    } else {
        println("The given array is not a valid mountain array")
    }
}
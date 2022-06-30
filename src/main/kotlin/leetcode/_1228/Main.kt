package leetcode._1228

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
    val output = solution.missingNumber(arr)

    println("The missing number is: $output")
}
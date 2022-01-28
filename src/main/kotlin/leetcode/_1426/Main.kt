package leetcode._1426

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val arr = IntArray(size)
    for (index in arr.indices) {
        print("Enter the value at index $index: ")
        arr[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.countElements(arr)

    println("The number of elements in the array which match the condition is: $output")
}
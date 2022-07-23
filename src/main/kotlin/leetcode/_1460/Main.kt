package leetcode._1460

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the arrays: ")
    val size = scanner.nextInt()

    val target = IntArray(size)
    println("Enter the values in target array")
    for (index in target.indices) {
        print("Enter the value at index $index: ")
        target[index] = scanner.nextInt()
    }

    val arr = IntArray(size)
    println("Enter the values in arr array")
    for (index in arr.indices) {
        print("Enter the value at index $index: ")
        arr[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.canBeEqual(target, arr)

    if (output) {
        println("The two arrays can be made equal")
    } else {
        println("The two arrays cannot be made equal")
    }
}
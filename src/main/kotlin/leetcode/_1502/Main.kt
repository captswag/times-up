package leetcode._1502

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val arr = IntArray(size)
    for (index in arr.indices) {
        print("Enter the value at index $index: ")
        arr[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.canMakeArithmeticProgression(arr)

    if (output) {
        println("The numbers can be rearranged to form an arithmetic progression")
    } else {
        println("The numbers cannot be rearranged to form an arithmetic progression")
    }
}
package leetcode._1550

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
    val output = solution.threeConsecutiveOdds(arr)

    if (output) {
        println("There are three consecutive odds")
    } else {
        println("There are no three consecutive odds")
    }
}
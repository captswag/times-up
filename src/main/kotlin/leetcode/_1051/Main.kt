package leetcode._1051

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val heights = IntArray(size)
    for (index in heights.indices) {
        print("Enter the value at index $index: ")
        heights[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.heightChecker(heights)

    println("The number of students standing at wrong order are: $output")
}
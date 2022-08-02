package leetcode._1893

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val ranges = Array(size) { IntArray(2) }
    for (index in ranges.indices) {
        print("Index: $index")
        print("Enter the start range: ")
        val start = scanner.nextInt()
        print("Enter the end range: ")
        val end = scanner.nextInt()
        ranges[index] = intArrayOf(start, end)
    }

    print("Enter the value of left: ")
    val left = scanner.nextInt()

    print("Enter the value of right: ")
    val right = scanner.nextInt()

    val solution = Solution()
    val output = solution.isCovered(ranges, left, right)

    if (output) {
        println("All integers in the range are covered")
    } else {
        println("All integers in the range are not covered")
    }
}
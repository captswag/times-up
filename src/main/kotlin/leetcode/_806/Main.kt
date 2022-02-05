package leetcode._806

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the width array: ")
    val size = scanner.nextInt()

    val widths = IntArray(size)
    for (index in widths.indices) {
        print("Enter the width at index $index: ")
        widths[index] = scanner.nextInt()
    }

    print("Enter the value of string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.numberOfLines(widths, s)

    println("Total number of lines: ${output[0]}")
    println("Width of the last line in pixels: ${output[1]}")
}
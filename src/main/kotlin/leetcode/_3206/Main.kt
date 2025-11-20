package leetcode._3206

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val colors = IntArray(size)
    for (index in colors.indices) {
        print("Enter the value at index $index: ")
        colors[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.numberOfAlternatingGroups(colors)

    println("Number of alternating groups is $output")
}
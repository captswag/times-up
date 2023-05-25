package leetcode._2078

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val colors = IntArray(size)
    for (index in colors.indices) {
        print("Enter the value at index $index: ")
        colors[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.maxDistance(colors)

    println("The furthest distance is: $output")
}
package leetcode._3502

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val cost = IntArray(size)
    for (index in cost.indices) {
        print("Enter the value at index $index: ")
        cost[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.minCosts(cost)

    output.displayFormatted()
}
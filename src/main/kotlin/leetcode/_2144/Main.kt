package leetcode._2144

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val cost = IntArray(size)
    for (index in cost.indices) {
        print("Enter the value at index $index: ")
        cost[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.minimumCost(cost)

    println("The minimum cost of buying candies without discount is: $output")
}
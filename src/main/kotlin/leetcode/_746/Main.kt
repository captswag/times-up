package leetcode._746

import leetcode._746.solutionconstantspace.SolutionConstantSpace
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

    val solution: Solution = SolutionConstantSpace()
    val output = solution.minCostClimbingStairs(cost)

    println("The minimum cost to reach the top of the floor is: $output")
}
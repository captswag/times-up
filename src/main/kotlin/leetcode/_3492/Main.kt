package leetcode._3492

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the value of w: ")
    val w = scanner.nextInt()

    print("Enter the value of maxWeight: ")
    val maxWeight = scanner.nextInt()

    val solution = Solution()
    val output = solution.maxContainers(n, w, maxWeight)

    println("The maximum number of containers that can be loaded onto the ship is $output")
}
package leetcode._70

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of stairs to climb: ")
    val steps = scanner.nextInt()

    val solution = Solution()
    val output = solution.climbStairs(steps)

    println("The number of ways to climb $steps is: $output")
}
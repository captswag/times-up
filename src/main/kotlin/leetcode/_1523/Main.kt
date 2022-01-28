package leetcode._1523

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of low: ")
    val low = scanner.nextInt()

    print("Enter the value of high: ")
    val high = scanner.nextInt()

    val solution = Solution()
    val output = solution.countOdds(low, high)

    println("The number of odd numbers in the given range is: $output")
}
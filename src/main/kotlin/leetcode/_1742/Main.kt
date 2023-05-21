package leetcode._1742

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of lowLimit: ")
    val lowLimit = scanner.nextInt()

    print("Enter the value of highLimit: ")
    val highLimit = scanner.nextInt()

    val solution = Solution()
    val output = solution.countBalls(lowLimit, highLimit)

    println("Most number of balls in a single box is: $output")
}
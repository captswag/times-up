package leetcode._1399

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.countLargestGroup(n)

    println("The number of groups with the largest size is: $output")
}
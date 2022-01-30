package leetcode._441

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of coins: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.arrangeCoins(n)

    println("The number of complete rows of the staircase is: $output")
}
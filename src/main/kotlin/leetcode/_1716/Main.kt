package leetcode._1716

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.totalMoney(n)

    println("Total amount of money: $output")
}
package leetcode._121

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the price array: ")
    val size = scanner.nextInt()

    val prices = IntArray(size)
    for (index in prices.indices) {
        print("Enter the value at index $index: ")
        prices[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.maxProfit(prices)

    println("The max profit that could be made is $output")
}
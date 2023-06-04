package leetcode._2706

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val prices = IntArray(size)
    for (index in prices.indices) {
        print("Enter the value at index $index: ")
        prices[index] = scanner.nextInt()
    }

    print("Enter the value for money: ")
    val money = scanner.nextInt()

    val solution = Solution()
    val output = solution.buyChoco(prices, money)

    println("Left over money is: $output")
}
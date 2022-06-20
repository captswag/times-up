package leetcode._1475

import extentions.displayFormatted
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

    val solution = Solution()
    val output = solution.finalPrices(prices)

    output.displayFormatted()
}
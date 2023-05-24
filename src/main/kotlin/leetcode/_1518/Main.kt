package leetcode._1518

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of numBottles: ")
    val numBottles = scanner.nextInt()

    print("Enter the value of numExchange: ")
    val numExchanges = scanner.nextInt()

    val solution = Solution()
    val output = solution.numWaterBottles(numBottles, numExchanges)

    println("The maximum number of bottles you can drink is: $output")
}
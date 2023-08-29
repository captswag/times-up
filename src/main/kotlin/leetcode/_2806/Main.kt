package leetcode._2806

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the purchase amount: ")
    val purchaseAmount = scanner.nextInt()

    val solution = Solution()
    val output = solution.accountBalanceAfterPurchase(purchaseAmount)

    println("Account balance after rounded purchase is: $output")
}
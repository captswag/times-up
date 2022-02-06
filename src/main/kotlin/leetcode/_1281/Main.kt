package leetcode._1281

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.subtractProductAndSum(n)

    println("The difference between the product and sum of all the digits of $n is: $output")
}
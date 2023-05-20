package leetcode._2600

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of numOnes: ")
    val numOnes = scanner.nextInt()

    print("Enter the value of numZeros: ")
    val numZeros = scanner.nextInt()

    print("Enter the value of numNegOnes: ")
    val numNegOnes = scanner.nextInt()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k)

    println("Maximum possible sum of numbers written on the items: $output")
}
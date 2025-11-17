package leetcode._3663

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.getLeastFrequentDigit(n)

    println("The least frequent digit in $n is: $output")
}
package leetcode._2231

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of num: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.largestInteger(num)

    println("Largest number after digit swaps by parity is: $output")
}
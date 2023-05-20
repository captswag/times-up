package leetcode._2652

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.sumOfMultiples(n)

    println("Sum of all numbers in the given range satisfying the constraint is: $output")
}
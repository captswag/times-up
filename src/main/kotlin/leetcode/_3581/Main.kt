package leetcode._3581

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.countOddLetters(n)

    println("Number of distinct characters in $n that appear an odd number of times are $output")
}
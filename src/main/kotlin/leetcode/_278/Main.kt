package leetcode._278

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the bad version: ")
    val bad = scanner.nextInt()

    val solution = Solution()
    solution.badVersion = bad
    val output = solution.findBadVersion(n)

    println("The bad version starts from: $output")
}
package leetcode._1374

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.generateTheString(n)

    println("The random generate string is: $output")
}
package leetcode._509

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.fib(n)

    println("The fibonacci number at $n is: $output")
}
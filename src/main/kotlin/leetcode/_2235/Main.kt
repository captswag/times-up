package leetcode._2235

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter number 1: ")
    val num1 = scanner.nextInt()

    print("Enter number 2: ")
    val num2 = scanner.nextInt()

    val solution = Solution()
    val output = solution.sum(num1, num2)

    println("The sum of $num1 & $num2 is: $output")
}
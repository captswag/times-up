package leetcode._415

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the first number: ")
    val num1 = scanner.next()

    print("Enter the second number: ")
    val num2 = scanner.next()

    val solution = Solution()
    val output = solution.addStrings(num1, num2)

    println("$num1 + $num2 = $output")
}
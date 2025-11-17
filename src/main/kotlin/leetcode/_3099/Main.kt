package leetcode._3099

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of x: ")
    val x = scanner.nextInt()

    val solution = Solution()
    val output = solution.sumOfTheDigitsOfHarshadNumber(x)

    println("The sum of digits of x is $output")
}
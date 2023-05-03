package leetcode._2520

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.countDigits(num)

    println("The number of digits in $num that divides $num is: $output")
}
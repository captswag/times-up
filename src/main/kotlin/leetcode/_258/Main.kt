package leetcode._258

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.addDigits(num)

    println("The output is: $output")
}
package leetcode._1323

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.maximum69Number(num)

    println("The maximum number is: $output")
}
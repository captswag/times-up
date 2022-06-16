package leetcode._2169

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter num1: ")
    val num1 = scanner.nextInt()

    print("Enter num2: ")
    val num2 = scanner.nextInt()

    val solution = Solution()
    val output = solution.countOperations(num1, num2)

    println("The number of operations required to obtain zero is: $output")
}
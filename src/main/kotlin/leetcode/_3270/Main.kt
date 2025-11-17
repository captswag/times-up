package leetcode._3270

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter number 1: ")
    val num1 = scanner.nextInt()

    print("Enter number 2: ")
    val num2 = scanner.nextInt()

    print("Enter number 3: ")
    val num3 = scanner.nextInt()

    val solution = Solution()
    val output = solution.generateKey(num1, num2, num3)

    println("Key is $output")
}
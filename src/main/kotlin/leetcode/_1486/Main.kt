package leetcode._1486

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the value of start: ")
    val start = scanner.nextInt()

    val solution = Solution()
    val output = solution.xorOperation(n, start)

    println("The xor of all the numbers is: $output")
}
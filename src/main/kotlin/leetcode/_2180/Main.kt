package leetcode._2180

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value for num: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.countEven(num)

    println("The integers with even digit sum is $output")
}
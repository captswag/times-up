package leetcode._1342

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of num: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.numberOfSteps(num)

    println("The number of steps to reach 0 is: $output")
}
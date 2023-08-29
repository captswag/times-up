package leetcode._2769

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of num: ")
    val num = scanner.nextInt()

    print("Enter the value of t: ")
    val t = scanner.nextInt()

    val solution = Solution()
    val output = solution.theMaximumAchievableX(num, t)

    println("The maximum achievable number is: $output")
}
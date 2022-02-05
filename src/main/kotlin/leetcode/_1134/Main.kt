package leetcode._1134

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.isArmstrong(n)

    if (output) {
        println("$n is an Armstrong number")
    } else {
        println("$n is not an Armstrong number")
    }
}
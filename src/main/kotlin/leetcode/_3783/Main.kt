package leetcode._3783

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.mirrorDistance(n)

    println("Mirror distance of $n is $output")
}
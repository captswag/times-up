package leetcode._2682

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.circularGameLosers(n, k)

    output.displayFormatted()
}
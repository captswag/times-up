package leetcode._1304

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.sumZero(n)

    output.displayFormatted()
}
package leetcode._728

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of left: ")
    val left = scanner.nextInt()

    print("Enter the value of right: ")
    val right = scanner.nextInt()

    val solution = Solution()
    val output = solution.selfDividingNumbers(left, right)

    output.displayFormatted()
}
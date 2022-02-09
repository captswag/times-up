package leetcode._2138

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    print("Enter the character fill: ")
    val fill = scanner.next()[0]

    val solution = Solution()
    val output = solution.divideString(s, k, fill)

    output.displayFormatted()
}
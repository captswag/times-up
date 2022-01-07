package leetcode._821

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the char c to be matched with: ")
    val c = scanner.next()[0]

    val solution = Solution()
    val output = solution.shortestToChar(s, c)

    output.displayFormatted()
}
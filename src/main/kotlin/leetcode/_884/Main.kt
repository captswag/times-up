package leetcode._884

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter string s1: ")
    val s1 = scanner.nextLine()

    print("Enter string s2: ")
    val s2 = scanner.nextLine()

    val solution = Solution()
    val output = solution.uncommonFromSentences(s1, s2)

    output.displayFormatted()
}
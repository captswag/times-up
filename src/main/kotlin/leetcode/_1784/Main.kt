package leetcode._1784

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.checkOnesSegment(s)

    if (output) {
        println("The ones do form a contiguous segment")
    } else {
        println("The ones do not form a contiguous segment")
    }
}
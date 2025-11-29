package leetcode._3438

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.findValidPair(s)

    println("The first valid pair is $output")
}
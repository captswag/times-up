package leetcode._1332

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.removePalindromeSub(s)

    println("The minimum number of steps to make the given string empty is: $output")
}
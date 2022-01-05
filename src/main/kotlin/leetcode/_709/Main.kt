package leetcode._709

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.toLowerCase(s)

    println("The string after converting lower case to upper case is $output")
}
package leetcode._2351

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.repeatedCharacter(s)

    println("The first character to appear twice is: $output")
}
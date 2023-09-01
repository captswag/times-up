package leetcode._2810

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.finalString(s)

    println("The string that will be present on the laptop screen is: $output")
}
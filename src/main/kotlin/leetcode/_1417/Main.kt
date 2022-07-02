package leetcode._1417

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.reformat(s)

    println("The string after reformatting is: $output")
}
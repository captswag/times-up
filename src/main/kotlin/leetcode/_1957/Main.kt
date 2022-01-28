package leetcode._1957

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.makeFancyString(s)

    println("The fancy string is: $output")
}
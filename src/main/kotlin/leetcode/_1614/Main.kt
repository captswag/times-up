package leetcode._1614

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxDepth(s)

    println("Maximum depth of $s is: $output")
}
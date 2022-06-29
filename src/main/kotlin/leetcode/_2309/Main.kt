package leetcode._2309

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.greatestLetter(s)

    println("Greatest English letter is: $output")
}
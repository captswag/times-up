package leetcode._1271

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value num: ")
    val num = scanner.next()

    val solution = Solution()
    val output = solution.toHexspeak(num)

    println("The Hexspeak representation of $num is: $output")
}
package leetcode._1189

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of text: ")
    val text = scanner.next()

    val solution = Solution()
    val output = solution.maxNumberOfBalloons(text)

    println("Maximum number of balloon instances that can be formed is $output")
}
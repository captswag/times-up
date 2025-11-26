package leetcode._3582

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string caption: ")
    val caption = scanner.nextLine()

    val solution = Solution()
    val output = solution.generateTag(caption)

    println("The tag is $output")
}
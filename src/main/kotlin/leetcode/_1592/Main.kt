package leetcode._1592

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the text: ")
    val text = scanner.nextLine()

    val solution = Solution()
    val output = solution.reorderSpaces(text)

    println(output)
}
package leetcode._2129

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the title: ")
    val title = scanner.nextLine()

    val solution = Solution()
    val output = solution.capitalizeTitle(title)

    println("The title after capitalizing is: $output")
}
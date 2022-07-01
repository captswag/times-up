package leetcode._1496

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the path: ")
    val path = scanner.next()

    val solution = Solution()
    val output = solution.isPathCrossing(path)

    if (output) {
        println("Path crosses itself")
    } else {
        println("Path doesn't cross itself")
    }
}
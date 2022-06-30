package leetcode._1736

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the time: ")
    val time = scanner.next()

    val solution = Solution()
    val output = solution.maximumTime(time)

    println("Latest time is: $output")
}
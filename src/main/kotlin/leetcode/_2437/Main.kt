package leetcode._2437

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the time: ")
    val time = scanner.next()

    val solution = Solution()
    val output = solution.countTime(time)

    println("The number of valid clock times are: $output")
}
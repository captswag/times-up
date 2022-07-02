package leetcode._1688

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of teams: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.numberOfMatches(n)

    println("Total number of matches: $output")
}
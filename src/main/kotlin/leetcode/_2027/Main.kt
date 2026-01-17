package leetcode._2027

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.minimumMoves(s)

    println("Minimum number of moves required is $output")
}
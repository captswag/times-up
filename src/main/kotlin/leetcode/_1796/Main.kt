package leetcode._1796

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.secondHighest(s)

    println("The second largest digit is: $output")
}
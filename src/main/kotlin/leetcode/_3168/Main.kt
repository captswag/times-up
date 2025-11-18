package leetcode._3168

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.minimumChairs(s)

    println("Minimum number of chairs needed is: $output")
}
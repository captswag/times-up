package leetcode._1576

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.modifyString(s)

    println("The modified string is: $output")
}
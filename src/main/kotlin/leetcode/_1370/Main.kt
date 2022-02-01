package leetcode._1370

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.sortString(s)

    println("The sorted string is: $output")
}
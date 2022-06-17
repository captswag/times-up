package leetcode._1047

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.removeDuplicates(s)

    println("The string after removing adjacent duplicates is: $output")
}
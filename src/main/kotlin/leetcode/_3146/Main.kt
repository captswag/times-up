package leetcode._3146

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of s: ")
    val s = scanner.next()

    print("Enter the value of t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.findPermutationDifference(s, t)

    println("The permutation difference is $output")
}
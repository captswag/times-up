package leetcode._1941

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.areOccurrencesEqual(s)

    if (output) {
        println("All the characters have equal number of occurrence")
    } else {
        println("All the characters don't have equal number of occurence")
    }
}
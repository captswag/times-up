package leetcode._1790

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of string s1: ")
    val s1 = scanner.next()

    print("Enter the value of string s2: ")
    val s2 = scanner.next()

    val solution = Solution()
    val output = solution.areAlmostEqual(s1, s2)

    if (output) {
        println("The two strings can be almost equal")
    } else {
        println("The two strings cannot be almost equal")
    }
}

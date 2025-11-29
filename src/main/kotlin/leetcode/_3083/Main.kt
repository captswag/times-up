package leetcode._3083

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.isSubstringPresent(s)

    if (output) {
        println("Existence of a substring in a string and its reverse exists")
    } else {
        println("Existence of a substring in a string and its reverse doesn't exist")
    }
}
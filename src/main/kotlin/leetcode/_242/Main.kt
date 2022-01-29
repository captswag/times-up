package leetcode._242

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of string s: ")
    val s = scanner.next()

    print("Enter the value of string t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.isAnagram(s, t)

    if (output) {
        println("$t is a valid anagram of $s")
    } else {
        println("$t is not a valid anagram of $s")
    }
}
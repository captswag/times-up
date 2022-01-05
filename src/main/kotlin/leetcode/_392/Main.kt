package leetcode._392

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the subsequence s: ")
    val s = scanner.next()

    print("Enter the string t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.isSubsequence(s, t)

    if (output) {
        println("$s is a subsequence of $t")
    } else {
        println("$s is not a subsequence of $t")
    }
}
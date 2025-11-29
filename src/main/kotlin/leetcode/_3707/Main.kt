package leetcode._3707

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.scoreBalance(s)

    if (output) {
        println("An equal score substring exists")
    } else {
        println("An equal score substring doesn't exist")
    }
}
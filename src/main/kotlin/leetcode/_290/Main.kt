package leetcode._290

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string pattern: ")
    val pattern = scanner.next()

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.wordPattern(pattern, s)

    if (output) {
        println("$pattern and $s follows the same pattern")
    } else {
        println("$pattern and $s doesn't follow the same pattern")
    }
}
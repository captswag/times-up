package leetcode._859

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the string goal: ")
    val goal = scanner.next()

    val solution = Solution()
    val output = solution.buddyStrings(s, goal)

    if (output) {
        println("The strings $s and $goal are buddy strings")
    } else {
        println("The strings $s and $goal are not buddy strings")
    }
}
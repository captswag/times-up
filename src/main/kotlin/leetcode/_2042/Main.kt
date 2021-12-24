package leetcode._2042

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.areNumbersAscending(s)

    if (output) {
        println("The tokens are in ascending order")
    } else {
        println("The tokens are in descending order")
    }
}
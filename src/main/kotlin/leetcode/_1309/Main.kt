package leetcode._1309

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.freqAlphabets(s)

    println("The string after mapping is: $output")
}
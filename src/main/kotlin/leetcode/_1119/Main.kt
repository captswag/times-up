package leetcode._1119

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.removeVowels(s)

    println("The new string after removing vowels is: $output")
}
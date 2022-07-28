package leetcode._1624

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.maxLengthBetweenEqualCharacters(s)

    println("Largest substring between two equal characters is: $output")
}
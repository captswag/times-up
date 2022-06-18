package leetcode._1071

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first string: ")
    val str1 = scanner.next()

    print("Enter second string: ")
    val str2 = scanner.next()

    val solution = Solution()
    val output = solution.gcdOfStrings(str1, str2)

    println("The GCD of the given two strings is: $output")
}
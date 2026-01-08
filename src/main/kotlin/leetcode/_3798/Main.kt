package leetcode._3798

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.largestEven(s)

    println("The largest possible resultant string is $output")
}
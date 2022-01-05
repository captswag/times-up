package leetcode._541

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.reverseStr(s, k)

    println("The reverse of the given string is: $output")
}
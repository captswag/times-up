package leetcode._3662

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of string s: ")
    val s = scanner.next()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.filterCharacters(s, k)

    println("The resulting string is: $output")
}
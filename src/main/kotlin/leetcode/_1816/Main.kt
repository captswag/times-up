package leetcode._1816

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.nextLine()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.truncateSentence(s, k)

    println("The sentence after truncating is: $output")
}
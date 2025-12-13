package leetcode._3014

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.minimumPushes(word)

    println("Minimum number of pushes needed to type $word after remapping the keys is $output")
}
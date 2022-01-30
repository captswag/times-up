package leetcode._1859

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the sentence: ")
    val s = scanner.nextLine()

    val solution = Solution()
    val output = solution.sortSentence(s)

    println("The output sentence is: $output")
}
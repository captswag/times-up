package leetcode._2490

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the sentence: ")
    val sentence = scanner.nextLine()

    val solution = Solution()
    val output = solution.isCircularSentence(sentence)

    if (output) {
        println("The given sentence is a circular sentence")
    } else {
        println("The given sentence is not a circular sentence")
    }
}
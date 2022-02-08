package leetcode._1832

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the sentence: ")
    val sentence = scanner.next()

    val solution = Solution()
    val output = solution.checkIfPangram(sentence)

    if (output) {
        println("The sentence is a pangram")
    } else {
        println("The sentence is not a pangram")
    }
}
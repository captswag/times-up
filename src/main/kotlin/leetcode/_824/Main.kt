package leetcode._824

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the sentence: ")
    val sentence = scanner.nextLine()

    val solution = Solution()
    val output = solution.toGoatLatin(sentence)

    println("After conversion to Goat Latin: $output")
}
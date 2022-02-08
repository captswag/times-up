package leetcode._1455

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the sentence: ")
    val sentence = scanner.nextLine()

    print("Enter the searchWord: ")
    val searchWord = scanner.next()

    val solution = Solution()
    val output = solution.isPrefixOfWord(sentence, searchWord)

    println("The index of the word with the prefix $searchWord is: $output")
}
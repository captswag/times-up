package leetcode._2114

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the sentences array: ")
    val size = scanner.nextInt()

    val sentences = Array(size) { "" }
    for (index in sentences.indices) {
        print("Enter the sentence at index $index: ")
        sentences[index] = scanner.nextLine()
    }

    val solution = Solution()
    val output = solution.mostWordsFound(sentences)

    println("The maximum number of words in the sentences array is $output")
}
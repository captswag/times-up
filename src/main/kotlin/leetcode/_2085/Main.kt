package leetcode._2085

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of words array 1: ")
    val size1 = scanner.nextInt()

    val words1 = Array(size1) { "" }
    for (index in words1.indices) {
        print("Enter the word at index $index: ")
        words1[index] = scanner.next()
    }

    print("Enter the size of the words array 2: ")
    val size2 = scanner.nextInt()

    val words2 = Array(size2) { "" }
    for (index in words2.indices) {
        print("Enter the word at index $index: ")
        words2[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.countWords(words1, words2)

    println("The number of strings that appears exactly once in each of the two arrays is: $output")
}
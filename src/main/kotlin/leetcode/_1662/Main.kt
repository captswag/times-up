package leetcode._1662

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of word1 Array: ")
    val size1 = scanner.nextInt()

    val word1 = Array(size1) { "" }
    for (index in word1.indices) {
        print("Enter the word at index $index: ")
        word1[index] = scanner.next()
    }

    print("Enter the size of word2 Array: ")
    val size2 = scanner.nextInt()

    val word2 = Array(size2) { "" }
    for (index in word2.indices) {
        print("Enter the word at index $index: ")
        word2[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.arrayStringsAreEqual(word1, word2)

    if (output) {
        println("The two string arrays are equal")
    } else {
        println("The two string arrays are not equal")
    }
}
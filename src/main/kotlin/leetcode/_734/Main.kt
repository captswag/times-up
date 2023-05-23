package leetcode._734

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter size of sentence array 1: ")
    val size1 = scanner.nextInt()

    val sentence1 = Array(size1) { "" }
    for (index in sentence1.indices) {
        print("Enter the string at index $index: ")
        sentence1[index] = scanner.next()
    }

    print("Enter size of sentence array 2: ")
    val size2 = scanner.nextInt()

    val sentence2 = Array(size2) { "" }
    for (index in sentence2.indices) {
        print("Enter the string at index $index: ")
        sentence2[index] = scanner.next()
    }

    print("Enter the size of the similarPairs array: ")
    val size = scanner.nextInt()

    val similarPairs = mutableListOf<List<String>>()
    for (index in 0 until size) {
        println("Enter pair $index: ")
        val pair = listOf(scanner.next(), scanner.next())
        similarPairs.add(pair)
    }

    val solution = Solution()
    val output = solution.areSentencesSimilar(sentence1, sentence2, similarPairs)

    if (output) {
        println("Sentence 1 and sentence 2 are similar")
    } else {
        println("Sentence 1 and sentence 2 are not similar")
    }
}
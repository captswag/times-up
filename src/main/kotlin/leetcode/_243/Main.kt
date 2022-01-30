package leetcode._243

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the wordsDict: ")
    val size = scanner.nextInt()

    val wordsDict = Array(size) { "" }
    for (index in wordsDict.indices) {
        print("Enter the word at index $index: ")
        wordsDict[index] = scanner.next()
    }

    print("Enter word1: ")
    val word1 = scanner.next()

    print("Enter word2: ")
    val word2 = scanner.next()

    val solution = Solution()
    val output = solution.shortestDistance(wordsDict, word1, word2)

    println("The smallest distance is: $output")
}
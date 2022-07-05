package leetcode._2068

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter word1: ")
    val word1 = scanner.next()

    print("Enter word2: ")
    val word2 = scanner.next()

    val solution = Solution()
    val output = solution.checkAlmostEquivalent(word1, word2)

    if (output) {
        println("The strings $word1 & $word2 are almost equivalent")
    } else {
        println("The strings $word1 & $word2 are not almost equivalent")
    }
}
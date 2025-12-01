package leetcode._2062

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.countVowelSubstrings(word)

    println("Number of vowel substrings is $output")
}
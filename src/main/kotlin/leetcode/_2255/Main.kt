package leetcode._2255

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array words: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    print("Enter the word s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.countPrefixes(words, s)

    println("The number of strings in words which are a prefix of s is: $output")
}
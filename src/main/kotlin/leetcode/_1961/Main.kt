package leetcode._1961

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.isPrefixString(s, words)

    if (output) {
        println("$s is a prefix string.")
    } else {
        println("$s is not a prefix string.")
    }
}
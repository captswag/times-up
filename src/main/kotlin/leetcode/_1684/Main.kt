package leetcode._1684

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the allowed characters: ")
    val allowed = scanner.next()

    print("Enter the size: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.countConsistentStrings(allowed, words)

    println("The count of consistent strings is: $output")
}
package leetcode._804

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.uniqueMorseRepresentations(words)

    println("Number of different transformations is: $output")
}
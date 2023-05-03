package leetcode._2586

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

    print("Enter the left value: ")
    val left = scanner.nextInt()

    print("Enter the right value: ")
    val right = scanner.nextInt()

    val solution = Solution()
    val output = solution.vowelStrings(words, left, right)

    println("The number of vowel strings is: $output")
}
package leetcode._2451

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the string array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.oddString(words)

    println("The string with different difference integer array is $output")
}
package leetcode._500

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the word array: ")
    val size = scanner.nextInt()

    val words = mutableListOf<String>()
    for (index in 0 until size) {
        words.add(scanner.next())
    }

    val solution = Solution()
    val output = solution.findWords(words.toTypedArray())

    output.displayFormatted()
}
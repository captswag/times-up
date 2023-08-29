package leetcode._2788

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val words = mutableListOf<String>()
    for (index in 0 until size) {
        print("Enter the word at index $index: ")
        words.add(scanner.next())
    }

    print("Enter the value of separator: ")
    val separator = scanner.next()[0]

    val solution = Solution()
    val output = solution.splitWordsBySeparator(words, separator)

    output.displayFormatted()
}
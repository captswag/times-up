package leetcode._2942

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the words array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    print("Enter the value of x: ")
    val x = scanner.next()[0]

    val solution = Solution()
    val output = solution.findWordsContaining(words, x)

    output.displayFormatted()
}
package leetcode._2000

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word: ")
    val word = scanner.next()

    print("Enter the character to be searched for: ")
    val ch = scanner.next()[0]

    val solution = Solution()
    val output = solution.reversePrefix(word, ch)

    println("The word after reversing till the first prefix is: $output")
}
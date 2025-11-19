package leetcode._3120

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.numberOfSpecialChars(word)

    println("The number of special letters in $word are $output")
}
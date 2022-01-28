package leetcode._1935

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val text = scanner.nextLine()

    print("Enter the keys that are broken: ")
    val brokenLetters = scanner.next()

    val solution = Solution()
    val output = solution.canBeTypedWords(text, brokenLetters)

    println("The maximum number of words that can be typed is: $output")
}
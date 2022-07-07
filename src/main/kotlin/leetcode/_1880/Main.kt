package leetcode._1880

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the first word: ")
    val firstWord = scanner.next()

    print("Enter the second word: ")
    val secondWord = scanner.next()

    print("Enter the target word: ")
    val targetWord = scanner.next()

    val solution = Solution()
    val output = solution.isSumEqual(firstWord, secondWord, targetWord)

    if (output) {
        println("The summation of the numerical values of two words equals the target word")
    } else {
        println("The summation of the numerical values of two words doesn't equal the target word")
    }
}
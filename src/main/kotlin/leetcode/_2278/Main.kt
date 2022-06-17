package leetcode._2278

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the letter: ")
    val letter = scanner.next()[0]

    val solution = Solution()
    val output = solution.percentageLetter(s, letter)

    println("The percentage occurrence of letter $letter is: $output")
}
package leetcode._1974

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the word: ")
    val word = scanner.next()

    val solution = Solution()
    val output = solution.minTimeToType(word)

    println("The minimum time to type $word is: $output")
}
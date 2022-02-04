package leetcode._819

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the paragraph: ")
    val paragraph = scanner.nextLine()

    print("Enter the size of the array banned: ")
    val size = scanner.nextInt()

    val banned = Array(size) { "" }
    for (index in banned.indices) {
        print("Enter the word at index $index: ")
        banned[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.mostCommonWord(paragraph, banned)

    println("The most common word is: $output")
}
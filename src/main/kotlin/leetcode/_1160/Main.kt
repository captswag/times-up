package leetcode._1160

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val words = Array<String>(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    print("Enter the value of chars: ")
    val char = scanner.next()

    val solution = Solution()
    val output = solution.countCharacters(words, char)

    println("The sum of lengths of all good strings in words are: $output")
}
package leetcode._2828

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val words = mutableListOf<String>()
    for (index in 0 until size) {
        print("Enter the word at index $index: ")
        words.add(scanner.next())
    }

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.isAcronym(words, s)

    if (output) {
        println("$s is an acronym of the given words")
    } else {
        println("$s is not an acronym of the given words")
    }
}
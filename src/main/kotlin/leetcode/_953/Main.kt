package leetcode._953

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

    print("Enter the order: ")
    val order = scanner.next()

    val solution = Solution()
    val output = solution.isAlienSorted(words, order)

    if (output) {
        println("The given sequence of words is sorted in lexicographical order")
    } else {
        println("The given sequence of words is not sorted in lexicographical order")
    }
}
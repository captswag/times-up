package leetcode._2515

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter the word at index $index: ")
        words[index] = scanner.next()
    }

    print("Enter the target value: ")
    val target = scanner.next()

    print("Enter the start index: ")
    val startIndex = scanner.nextInt()

    val solution = Solution()
    val output = solution.closetTarget(words, target, startIndex)

    println("Shortest distance to reach $target is: $output")
}
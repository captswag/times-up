package leetcode._2185

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the string array: ")
    val size = scanner.nextInt()

    val words = Array(size) { "" }
    for (index in words.indices) {
        print("Enter word at index $index: ")
        words[index] = scanner.next()
    }

    print("Enter the prefix word: ")
    val pref = scanner.next()

    val solution = Solution()
    val output = solution.prefixCount(words, pref)

    println("There are $output strings that contain $pref as prefix")
}
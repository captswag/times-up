package leetcode._14

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of strings: ")
    val size = scanner.nextInt()

    val strings = mutableListOf<String>()

    for (index in 0 until size) {
        print("Enter the string at index $index: ")
        strings.add(scanner.next())
    }

    val solution = Solution()
    val output = solution.longestCommonPrefix(strings.toTypedArray())
    print("The longest common prefix is: $output")
}
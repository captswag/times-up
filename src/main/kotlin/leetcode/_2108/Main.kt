package leetcode._2108

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val strings = mutableListOf<String>()
    for (index in 0 until size) {
        strings.add(scanner.next())
    }

    val solution = Solution()
    val output = solution.firstPalindrome(strings.toTypedArray())

    println("The first palindromic string in the array is: $output")
}
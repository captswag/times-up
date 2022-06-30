package leetcode._1869

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.checkZeroOnes(s)

    if (output) {
        println("Longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's")
    } else {
        println("Longest contiguous segment of 1's is not strictly longer than the longest contiguous segment of 0's")
    }
}
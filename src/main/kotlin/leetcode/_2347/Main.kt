package leetcode._2347

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val ranks = IntArray(5)
    for (index in 0 until 5) {
        print("Enter the rank at index $index: ")
        ranks[index] = scanner.nextInt()
    }

    val suits = CharArray(5)
    for (index in 0 until 5) {
        print("Enter the suit at index $index: ")
        suits[index] = scanner.next()[0]
    }

    val solution = Solution()
    val output = solution.bestHand(ranks, suits)

    println("Best poker hand is: $output")
}
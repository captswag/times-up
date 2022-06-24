package leetcode._1560

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val rounds = IntArray(size)
    for (index in rounds.indices) {
        print("Enter the value at index $index: ")
        rounds[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.mostVisited(n, rounds)

    output.displayFormatted()
}
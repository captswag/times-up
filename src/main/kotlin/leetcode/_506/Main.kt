package leetcode._506

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the score array: ")
    val size = scanner.nextInt()

    val score = IntArray(size)
    for (index in score.indices) {
        print("Enter the score at index $index: ")
        score[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.findRelativeRanks(score)

    output.displayFormatted()
}
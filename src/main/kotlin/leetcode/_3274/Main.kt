package leetcode._3274

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the coordinates of square 1: ")
    val coordinate1 = scanner.next()

    print("Enter the coordinates of square 2: ")
    val coordinate2 = scanner.next()

    val solution = Solution()
    val output = solution.checkTwoChessboards(coordinate1, coordinate2)

    if (output) {
        println("Both coordinates have the same color")
    } else {
        println("Both coordinates don't have the same color")
    }
}
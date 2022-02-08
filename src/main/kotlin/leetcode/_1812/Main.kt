package leetcode._1812

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the coordinates: ")
    val coordinates = scanner.next()

    val solution = Solution()
    val output = solution.squareIsWhite(coordinates)

    if (output) {
        println("The position is white")
    } else {
        println("The position is not white")
    }
}
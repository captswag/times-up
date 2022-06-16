package leetcode._657

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the moves: ")
    val moves = scanner.next()

    val solution = Solution()
    val output = solution.judgeCircle(moves)

    if (output) {
        println("The robot was able to move back to the original position")
    } else {
        println("The robot was unable to move back to the original position")
    }
}
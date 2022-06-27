package leetcode._999

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val board = Array(8) { CharArray(8) { '.' } }

    println("Rook position")
    print("Enter the row: ")
    val rookRow = scanner.nextInt()
    print("Enter the column: ")
    val rookColumn = scanner.nextInt()
    board[rookRow][rookColumn] = 'R'

    print("Enter the number of pawns: ")
    val pawnCount = scanner.nextInt()

    println("Pawns position")
    for (index in 0 until pawnCount) {
        print("Enter the row: ")
        val pawnRow = scanner.nextInt()
        print("Enter the column: ")
        val pawnColumn = scanner.nextInt()
        board[pawnRow][pawnColumn] = 'p'
    }

    print("Enter the number of bishops: ")
    val bishopCount = scanner.nextInt()

    println("Bishop position")
    for (index in 0 until bishopCount) {
        print("Enter the row: ")
        val bishopRow = scanner.nextInt()
        print("Enter the column: ")
        val bishopColumn = scanner.nextInt()
        board[bishopRow][bishopColumn] = 'B'
    }

    val solution = Solution()
    val output = solution.numRookCaptures(board)

    println("Number of available captures: $output")
}
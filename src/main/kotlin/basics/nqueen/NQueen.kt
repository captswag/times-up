package basics.nqueen

import kotlin.math.min

class NQueen {

    fun solve(n: Int) {
    }

    fun isValidPosition(board: Array<IntArray>, rowPosition: Int, columnPosition: Int): Boolean {
        val n = board.size

        // Check horizontal
        for (column in 0 until n) {
            if (board[rowPosition][column] == 1) {
                return false
            }
        }

        // Check vertical
        for (row in 0 until n) {
            if (board[row][columnPosition] == 1) {
                return false
            }
        }

        // Check left diagonal
        val min = min(rowPosition, columnPosition)
        var row = rowPosition - min
        var column = columnPosition - min

        while (row < n && column < n) {
            if (board[row][column] == 1) {
                return false
            }
            row++
            column++
        }

        // Check right diagonal
        val offset = min(rowPosition, (n - 1) - columnPosition)
        row = rowPosition - offset
        column = columnPosition + offset

        while (row < n && column > -1) {
            if (board[row][column] == 1) {
                return false
            }
            row++
            column--
        }

        return true
    }

    fun findCurrentColumnPosition(row: IntArray): Int = row.indexOf(1)
}
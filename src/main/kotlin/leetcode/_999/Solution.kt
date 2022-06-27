package leetcode._999

class Solution {
    fun numRookCaptures(board: Array<CharArray>): Int {
        var output = 0
        var rookRowIndex = -1
        var rookColumnIndex = -1
        for (rowIndex in board.indices) {
            for (columnIndex in board[rowIndex].indices) {
                if (board[rowIndex][columnIndex] == 'R') {
                    rookRowIndex = rowIndex
                    rookColumnIndex = columnIndex
                    break
                }
            }
        }

        // 0 means left, 1 means top, 2 means right and 3 means bottom
        for ((direction, _) in (0 until 4).withIndex()) {
            var tempRookRowIndex = rookRowIndex
            var tempRookColumnIndex = rookColumnIndex
            when (direction) {
                0 -> tempRookColumnIndex--
                1 -> tempRookRowIndex--
                2 -> tempRookColumnIndex++
                3 -> tempRookRowIndex++
            }

            // Now we have the initial values
            while (tempRookRowIndex > -1 && tempRookRowIndex < 8 && tempRookColumnIndex > -1 && tempRookColumnIndex < 8) {
                if (board[tempRookRowIndex][tempRookColumnIndex] == 'B') {
                    break
                } else if (board[tempRookRowIndex][tempRookColumnIndex] == 'p') {
                    output++
                    break
                }
                when (direction) {
                    0 -> tempRookColumnIndex--
                    1 -> tempRookRowIndex--
                    2 -> tempRookColumnIndex++
                    3 -> tempRookRowIndex++
                }
            }

        }

        return output
    }
}
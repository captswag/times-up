package leetcode._1351

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0

        for (rowIndex in grid.indices) {
            var low = 0
            var high = grid[rowIndex].size - 1
            var negativeIndex = grid[rowIndex].size

            while (low <= high) {
                val mid = (low + high) ushr 1

                if (grid[rowIndex][mid] < 0) {
                    negativeIndex = mid
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }

            count += (grid[rowIndex].size - negativeIndex)
        }

        return count
    }
}
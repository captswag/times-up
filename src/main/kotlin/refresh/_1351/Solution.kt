package refresh._1351

class Solution {

    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0

        for (i in grid.indices) {
            var low = 0
            var high = grid[i].size - 1
            var negativeIndex = grid[i].size

            while (low <= high) {
                val mid = (low + high) ushr 1

                if (grid[i][mid] < 0) {
                    negativeIndex = mid
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }

            count += (grid[i].size - negativeIndex)
        }

        return count
    }
}
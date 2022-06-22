package leetcode._1351

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var output = 0

        for (m in grid.indices) {
            var nLow = 0
            var nHigh = grid[m].size - 1
            var index = -1
            while (nLow <= nHigh) {
                val nMid = nLow + (nHigh - nLow) / 2
                if (grid[m][nMid] < 0) {
                    index = nMid
                    nHigh = nMid - 1
                } else {
                    nLow = nMid + 1
                }
            }
            if (index > -1) {
                output += (grid[m].size - index)
            }
        }

        return output
    }
}
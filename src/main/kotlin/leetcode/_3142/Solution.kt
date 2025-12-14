package leetcode._3142

class Solution {

    fun satisfiesConditions(grid: Array<IntArray>): Boolean {
        for (j in grid[0].indices) {
            for (i in 0 until grid.size - 1) {
                if (grid[i][j] != grid[i + 1][j]) {
                    return false
                }
            }

            if (j > 0 && grid[0][j] == grid[0][j - 1]) {
                return false
            }
        }
        return true
    }
}
package leetcode._3402

class Solution {

    fun minimumOperations(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var ops = 0

        for (ni in 0 until n) {
            for (mi in 1 until m) {
                if (grid[mi][ni] <= grid[mi - 1][ni]) {
                    val updatedValue = grid[mi - 1][ni] + 1
                    ops += (updatedValue - grid[mi][ni])
                    grid[mi][ni] = updatedValue
                }
            }
        }

        return ops
    }
}
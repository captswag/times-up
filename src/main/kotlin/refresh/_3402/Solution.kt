package refresh._3402

class Solution {

    fun minimumOperations(grid: Array<IntArray>): Int {
        var ops = 0

        for (c in grid[0].indices) {
            for (r in 1 until grid.size) {
                if (grid[r][c] <= grid[r - 1][c]) {
                    ops += (grid[r - 1][c] - grid[r][c] + 1)
                    grid[r][c] = grid[r - 1][c] + 1
                }
            }
        }

        return ops
    }
}
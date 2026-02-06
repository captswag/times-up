package refresh._3142

class Solution {

    fun satisfiesConditions(grid: Array<IntArray>): Boolean {
        for (c in grid[0].indices) {
            if (c + 1 < grid[0].size && grid[0][c] == grid[0][c + 1]) {
                return false
            }

            for (r in 1 until grid.size) {
                if (grid[r][c] != grid[r - 1][c]) {
                    return false
                }
            }
        }

        return true
    }
}
package refresh._2319

class Solution {

    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        for (r in grid.indices) {
            for (c in grid[r].indices) {
                if (r + c == grid.size - 1) {
                    if (grid[r][c] == 0) {
                        return false
                    }
                } else if (r == c) {
                    if (grid[r][c] == 0) {
                        return false
                    }
                } else if (grid[r][c] != 0) {
                    return false
                }
            }
        }

        return true
    }
}
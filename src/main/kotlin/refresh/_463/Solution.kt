package refresh._463

class Solution {

    fun islandPerimeter(grid: Array<IntArray>): Int {
        var sum = 0
        for (r in grid.indices) {
            for (c in grid[r].indices) {
                if (grid[r][c] == 1) {
                    var cur = 4
                    if (c - 1 > -1 && grid[r][c - 1] == 1) {
                        cur--
                    }
                    if (c + 1 < grid[r].size && grid[r][c + 1] == 1) {
                        cur--
                    }
                    if (r - 1 > -1 && grid[r - 1][c] == 1) {
                        cur--
                    }
                    if (r + 1 < grid.size && grid[r + 1][c] == 1) {
                        cur--
                    }
                    sum += cur
                }
            }
        }

        return sum
    }
}
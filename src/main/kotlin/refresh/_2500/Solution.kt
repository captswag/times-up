package refresh._2500

import kotlin.math.max

class Solution {

    fun deleteGreatestValue(grid: Array<IntArray>): Int {
        for (r in grid.indices) {
            grid[r].sort()
        }

        var j = grid[0].size - 1
        var sum = 0
        while (j > -1) {
            var mx = 0
            for (r in grid.indices) {
                mx = max(mx, grid[r][j])
            }
            sum += mx
            j--
        }

        return sum
    }
}
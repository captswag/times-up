package refresh._2639

import kotlin.math.abs

class Solution {

    fun findColumnWidth(grid: Array<IntArray>): IntArray {
        val ans = IntArray(grid[0].size)

        for (c in grid[0].indices) {
            var mx = 0
            for (r in grid.indices) {
                var cur = 0
                var x = grid[r][c]
                if (x == 0) {
                    cur++
                } else {
                    if (x < 0) {
                        cur++
                        x = abs(x)
                    }
                    while (x != 0) {
                        cur++
                        x /= 10
                    }
                }
                if (cur > mx) {
                    mx = cur
                }
            }
            ans[c] = mx
        }

        return ans
    }
}
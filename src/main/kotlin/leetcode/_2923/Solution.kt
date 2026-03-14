package leetcode._2923

class Solution {

    fun findChampion(grid: Array<IntArray>): Int {
        var ans = -1
        var mx = -1

        for (r in grid.indices) {
            var cur = 0
            for (c in grid[r].indices) {
                if (grid[r][c] == 1) {
                    cur++
                }
            }

            if (cur > mx) {
                ans = r
                mx = cur
            }
        }

        return ans
    }
}
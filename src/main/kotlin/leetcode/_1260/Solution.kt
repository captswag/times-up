package leetcode._1260

class Solution {

    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val m = grid.size
        val n = grid[0].size
        val ans = MutableList(grid.size) { MutableList(n) { 0 } }

        for (r in 0 until m) {
            for (c in 0 until n) {
                val idx = ((r * n) + c + k) % (m * n)
                ans[idx / n][idx % n] = grid[r][c]
            }
        }

        return ans
    }
}
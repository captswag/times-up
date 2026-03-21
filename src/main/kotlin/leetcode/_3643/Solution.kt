package leetcode._3643

class Solution {

    fun reverseSubmatrix(grid: Array<IntArray>, x: Int, y: Int, k: Int): Array<IntArray> {
        var l = x
        var r = l + k - 1

        while (l < r) {
            var c = y
            while (c < y + k) {
                val tmp = grid[l][c]
                grid[l][c] = grid[r][c]
                grid[r][c] = tmp
                c++
            }
            l++
            r--
        }

        return grid
    }
}
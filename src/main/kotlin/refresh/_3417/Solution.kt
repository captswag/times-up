package refresh._3417

class Solution {

    fun zigzagTraversal(grid: Array<IntArray>): List<Int> {
        var c = 0
        var dir = 1
        val res = mutableListOf<Int>()

        for (r in grid.indices) {
            while (c >= 0 && c < grid[r].size) {
                if ((r + c) and 1 == 0) {
                    res.add(grid[r][c])
                }
                c += dir
            }
            dir = -dir
            c += dir
        }

        return res
    }
}
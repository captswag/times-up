package leetcode._200.solutiondfs

import leetcode._200.Solution

class SolutionDfs : Solution {

    override fun numIslands(grid: Array<CharArray>): Int {
        var output = 0

        for (rowIndex in grid.indices) {
            for (columnIndex in grid[0].indices) {
                if (grid[rowIndex][columnIndex] == '1') {
                    output++
                    dfs(grid, rowIndex, columnIndex)
                }
            }
        }

        return output
    }

    private fun dfs(grid: Array<CharArray>, rowIndex: Int, columnIndex: Int) {
        if (rowIndex >= 0 && rowIndex < grid.size && columnIndex >= 0 && columnIndex < grid[0].size) {
            // Valid index
            if (grid[rowIndex][columnIndex] == '1') {
                grid[rowIndex][columnIndex] = '2'
                // Top
                dfs(grid, rowIndex - 1, columnIndex)
                // Left
                dfs(grid, rowIndex, columnIndex - 1)
                // Bottom
                dfs(grid, rowIndex + 1, columnIndex)
                // Right
                dfs(grid, rowIndex, columnIndex + 1)
                return
            } else {
                return
            }
        } else {
            return
        }
    }
}
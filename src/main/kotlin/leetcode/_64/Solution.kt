package leetcode._64

class Solution {

    fun minPathSum(grid: Array<IntArray>): Int {
        val rows = grid.size
        val columns = grid[0].size
        val minPathArray = Array(rows) { IntArray(columns) }

        for (rowIndex in grid.indices) {
            for (columnIndex in grid[0].indices) {
                if (rowIndex == 0 && columnIndex == 0) {
                    minPathArray[rowIndex][columnIndex] = grid[rowIndex][columnIndex]
                } else if (rowIndex == 0) {
                    minPathArray[rowIndex][columnIndex] =
                        minPathArray[rowIndex][columnIndex - 1] + grid[rowIndex][columnIndex]
                } else if (columnIndex == 0) {
                    minPathArray[rowIndex][columnIndex] =
                        minPathArray[rowIndex - 1][columnIndex] + grid[rowIndex][columnIndex]
                } else {
                    minPathArray[rowIndex][columnIndex] = Math.min(
                        minPathArray[rowIndex - 1][columnIndex], minPathArray[rowIndex][columnIndex - 1]
                    ) + grid[rowIndex][columnIndex]
                }
            }
        }

        return minPathArray[rows - 1][columns - 1]
    }
}
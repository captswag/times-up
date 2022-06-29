package leetcode._2319

class Solution {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        val rowDefaultRight = 0
        val columnDefaultRight = grid[rowDefaultRight].size - 1
        var output = true

        for (rowIndex in grid.indices) {
            for (columnIndex in grid[rowIndex].indices) {
                if (rowIndex == columnIndex || rowIndex - rowDefaultRight == columnDefaultRight - columnIndex) {
                    // Diagonal index
                    if (grid[rowIndex][columnIndex] == 0) {
                        output = false
                        break
                    }
                } else {
                    if (grid[rowIndex][columnIndex] != 0) {
                        output = false
                        break
                    }
                }
            }
        }

        return output
    }
}
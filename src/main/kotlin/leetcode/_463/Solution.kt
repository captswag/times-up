package leetcode._463

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        // We have to go through each particular index and do our 4 calculations
        var output = 0

        for (rowIndex in grid.indices) {
            for (columnIndex in 0 until grid[rowIndex].size) {
                if (grid[rowIndex][columnIndex] == 1) {
                    var perimeterCount = 4
                    val rowLeft = rowIndex - 1
                    if (validAndLandExists(rowLeft, columnIndex, grid.size, grid[rowIndex].size, grid)) {
                        perimeterCount--
                    }

                    val columnTop = columnIndex - 1
                    if (validAndLandExists(rowIndex, columnTop, grid.size, grid[rowIndex].size, grid)) {
                        perimeterCount--
                    }

                    val rowRight = rowIndex + 1
                    if (validAndLandExists(rowRight, columnIndex, grid.size, grid[rowIndex].size, grid)) {
                        perimeterCount--
                    }

                    val columnBottom = columnIndex + 1
                    if (validAndLandExists(rowIndex, columnBottom, grid.size, grid[rowIndex].size, grid)) {
                        perimeterCount--
                    }
                    output += perimeterCount
                }
            }
        }

        return output
    }

    private fun validAndLandExists(
        row: Int,
        column: Int,
        rowSize: Int,
        columnSize: Int,
        grid: Array<IntArray>
    ): Boolean = if (row in 0 until rowSize && column in 0 until columnSize) {
        // Valid row index
        grid[row][column] == 1
    } else {
        false
    }
}
package leetcode._2500

import java.util.*

class Solution {

    fun deleteGreatestValue(grid: Array<IntArray>): Int {
        for (rowIndex in grid.indices) {
            Arrays.sort(grid[rowIndex])
        }

        var sum = 0
        for (columnIndex in grid[0].size - 1 downTo 0) {
            var max = 0
            for (rowIndex in grid.indices) {
                max = Math.max(max, grid[rowIndex][columnIndex])
            }
            sum += max
        }
        return sum
    }
}
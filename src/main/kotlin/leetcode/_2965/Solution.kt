package leetcode._2965

class Solution {

    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val frequency = IntArray(grid.size * grid.size + 1)

        for (rowIndex in grid.indices) {
            for (columnIndex in grid[rowIndex].indices) {
                frequency[grid[rowIndex][columnIndex]]++
            }
        }

        val output = IntArray(2)
        for (index in 1 until frequency.size) {
            if (frequency[index] == 0) {
                output[1] = index
            } else if (frequency[index] == 2) {
                output[0] = index
            }
        }

        return output
    }
}
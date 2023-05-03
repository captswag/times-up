package leetcode._2639

class Solution {

    fun findColumnWidth(grid: Array<IntArray>): IntArray {
        val output = IntArray(grid[0].size)

        for ((index, columnIndex) in grid[0].indices.withIndex()) {
            var maxLength = 0
            for (rowIndex in grid.indices) {
                val currentLength = findLength(grid[rowIndex][columnIndex])
                if (currentLength > maxLength) {
                    maxLength = currentLength
                }
            }

            output[index] = maxLength
        }

        return output
    }

    private fun findLength(num: Int): Int {
        var length = if (num <= 0) {
            1
        } else {
            0
        }

        var number = num
        while (number != 0) {
            length++
            number /= 10
        }

        return length
    }
}
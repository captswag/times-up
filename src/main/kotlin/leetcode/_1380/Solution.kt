package leetcode._1380

class Solution {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val output = mutableListOf<Int>()

        for (rowIndex in matrix.indices) {
            var minColumnIndex = 0
            var minColumnValue = matrix[rowIndex][minColumnIndex]
            for (columnIndex in 1 until matrix[rowIndex].size) {
                if (matrix[rowIndex][columnIndex] < minColumnValue) {
                    minColumnValue = matrix[rowIndex][columnIndex]
                    minColumnIndex = columnIndex
                }
            }

            var maxRowValue = matrix[0][minColumnIndex]
            for (rIndex in 1 until matrix.size) {
                if (matrix[rIndex][minColumnIndex] > maxRowValue) {
                    maxRowValue = matrix[rIndex][minColumnIndex]
                }
            }

            if (minColumnValue == maxRowValue) {
                output.add(minColumnValue)
            }
        }

        return output
    }
}
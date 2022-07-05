package leetcode._867

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rowSize = matrix.size
        val columnSize = matrix[0].size

        val output = Array(columnSize) { IntArray(rowSize) }

        for (rowIndex in 0 until rowSize) {
            for (columnIndex in 0 until columnSize) {
                output[columnIndex][rowIndex] = matrix[rowIndex][columnIndex]
            }
        }

        return output
    }
}
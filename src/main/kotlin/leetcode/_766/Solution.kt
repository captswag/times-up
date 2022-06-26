package leetcode._766

class Solution {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        var output = true

        var rowIndex = matrix.size - 1
        var tempRowIndex = rowIndex
        var columnIndex = 0
        var tempColumnIndex = columnIndex

        while (rowIndex >= 0 && columnIndex < matrix[rowIndex].size) {
            while (tempRowIndex + 1 < matrix.size && tempColumnIndex + 1 < matrix[tempRowIndex].size) {
                if (matrix[tempRowIndex][tempColumnIndex] != matrix[tempRowIndex + 1][tempColumnIndex + 1]) {
                    output = false
                    break
                }
                tempRowIndex++
                tempColumnIndex++
            }
            if (rowIndex > 0) {
                rowIndex--
            } else {
                columnIndex++
            }
            tempRowIndex = rowIndex
            tempColumnIndex = columnIndex
        }

        return output
    }
}
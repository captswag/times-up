package leetcode._2133

class Solution {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        var output = true

        for (rowIndex in matrix.indices) {
            val rowSet = mutableSetOf<Int>()
            val columnSet = mutableSetOf<Int>()
            for (columnIndex in matrix[rowIndex].indices) {
                if (matrix[rowIndex][columnIndex] > 0 && matrix[rowIndex][columnIndex] <= matrix.size) {
                    if (!rowSet.add(matrix[rowIndex][columnIndex])) {
                        output = false
                        break
                    }
                } else {
                    output = false
                    break
                }

                if (matrix[columnIndex][rowIndex] > 0 && matrix[columnIndex][rowIndex] <= matrix.size) {
                    if (!columnSet.add(matrix[columnIndex][rowIndex])) {
                        output = false
                        break
                    }
                } else {
                    output = false
                    break
                }
            }
            rowSet.clear()
            columnSet.clear()
        }

        return output
    }
}
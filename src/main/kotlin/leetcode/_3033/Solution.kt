package leetcode._3033

class Solution {

    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
        for (j in matrix[0].indices) {
            var i = 0
            var max = matrix[i++][j]

            while (i < matrix.size) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j]
                }
                i++
            }

            i = 0
            while (i < matrix.size) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max
                }
                i++
            }
        }

        return matrix
    }
}
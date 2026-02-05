package refresh._3033

class Solution {

    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
        for (c in matrix[0].indices) {
            var mx = -1
            for (r in matrix.indices) {
                if (matrix[r][c] > mx) {
                    mx = matrix[r][c]
                }
            }

            for (r in matrix.indices) {
                if (matrix[r][c] == -1) {
                    matrix[r][c] = mx
                }
            }
        }

        return matrix
    }
}
package refresh._867

class Solution {

    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val res = Array(matrix[0].size) { IntArray(matrix.size) }

        for (x1 in matrix.indices) {
            for (y1 in matrix[x1].indices) {
                res[y1][x1] = matrix[x1][y1]
            }
        }

        return res
    }
}
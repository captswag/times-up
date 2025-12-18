package refresh._766

class Solution {

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        if (!hasSameDiagonalValues(0, 0, matrix)) {
            return false
        }

        var x = 1
        while (x < matrix.size) {
            if (!hasSameDiagonalValues(x, 0, matrix)) {
                return false
            }
            x++
        }

        var y = 1
        while (y < matrix[0].size) {
            if (!hasSameDiagonalValues(0, y, matrix)) {
                return false
            }
            y++
        }

        return true
    }

    private fun hasSameDiagonalValues(x: Int, y: Int, matrix: Array<IntArray>): Boolean {
        var i = x
        var j = y
        while (i + 1 < matrix.size && j + 1 < matrix[0].size) {
            if (matrix[i + 1][j + 1] != matrix[i][j]) {
                return false
            }
            i++
            j++
        }

        return true
    }
}
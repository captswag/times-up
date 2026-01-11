package refresh._1572

class Solution {

    fun diagonalSum(mat: Array<IntArray>): Int {
        var r = 0
        var c = 0
        var sum = 0

        while (r < mat.size && c < mat[r].size) {
            sum += mat[r++][c++]
        }

        r = 0
        c = mat[r].size - 1

        while (r < mat.size && c > -1) {
            if (r != c) {
                sum += mat[r][c]
            }
            r++
            c--
        }

        return sum
    }
}
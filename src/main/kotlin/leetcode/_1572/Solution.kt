package leetcode._1572

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var output = 0

        var x = 0
        var y = 0
        while (x < mat.size && y < mat[0].size) {
            output += mat[x++][y++]
        }

        x = 0
        y = mat.size - 1

        while (x < mat.size && y > -1) {
            if (!(mat.size % 2 == 1 && x == y)) {
                output += mat[x][y]
            }
            x++
            y--
        }

        return output
    }
}
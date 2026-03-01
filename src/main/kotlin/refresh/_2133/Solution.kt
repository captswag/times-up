package refresh._2133

class Solution {

    fun checkValid(matrix: Array<IntArray>): Boolean {
        for (i in matrix.indices) {
            val r = mutableSetOf<Int>()
            val c = mutableSetOf<Int>()

            for (j in matrix[i].indices) {
                r.add(matrix[i][j])
                c.add(matrix[j][i])
            }

            if (r.size != matrix.size || c.size != matrix.size) {
                return false
            }
        }

        return true
    }
}
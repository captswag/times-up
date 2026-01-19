package refresh._2133

class Solution {

    fun checkValid(matrix: Array<IntArray>): Boolean {
        val set = mutableSetOf<Int>()

        for (r in matrix.indices) {
            for (c in matrix[r].indices) {
                set.add(matrix[r][c])
            }
            if (set.size != matrix.size) {
                return false
            }
            set.clear()
        }

        for (c in matrix[0].indices) {
            for (r in matrix.indices) {
                set.add(matrix[r][c])
            }
            if (set.size != matrix.size) {
                return false
            }
            set.clear()
        }

        return true
    }
}
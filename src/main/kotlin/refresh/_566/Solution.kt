package refresh._566

class Solution {

    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        return if (mat.size * mat[0].size == r * c) {
            val a = Array(r) { IntArray(c) }
            var idx = 0

            for (x in mat.indices) {
                for (y in mat[x].indices) {
                    a[idx / c][idx % c] = mat[x][y]
                    idx++
                }
            }

            a
        } else {
            mat
        }
    }
}
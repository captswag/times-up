package refresh._2022

class Solution {

    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        return if (m * n == original.size) {
            val res = Array(m) { IntArray(n) }
            var i = 0
            for (r in res.indices) {
                for (c in res[r].indices) {
                    res[r][c] = original[i++]
                }
            }
            res
        } else {
            emptyArray()
        }
    }
}
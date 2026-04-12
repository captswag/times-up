package leetcode._3898

class Solution {

    fun findDegrees(matrix: Array<IntArray>): IntArray {
        val ans = IntArray(matrix.size)

        for (i in matrix.indices) {
            var cnt = 0
            for (x in matrix[i]) {
                if (x == 1) {
                    cnt++
                }
            }
            ans[i] = cnt
        }

        return ans
    }
}
package refresh._2643

class Solution {

    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        val ans = IntArray(2)
        var r = 0
        var cnt = 0

        for (c in mat[r].indices) {
            if (mat[r][c] == 1) {
                cnt++
            }
        }
        ans[1] = cnt
        r++

        while (r < mat.size) {
            cnt = 0
            for (c in mat[r].indices) {
                if (mat[r][c] == 1) {
                    cnt++
                }
            }
            if (cnt > ans[1]) {
                ans[0] = r
                ans[1] = cnt
            }
            r++
        }

        return ans
    }
}
package leetcode._2657

class Solution {

    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val seen = BooleanArray(51)
        val ans = IntArray(A.size)
        var cnt = 0

        for (i in A.indices) {
            if (seen[A[i]]) {
                cnt++
            }
            seen[A[i]] = true

            if (seen[B[i]]) {
                cnt++
            }
            seen[B[i]] = true

            ans[i] = cnt
        }

        return ans
    }
}
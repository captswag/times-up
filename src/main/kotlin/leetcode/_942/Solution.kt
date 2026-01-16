package leetcode._942

class Solution {

    fun diStringMatch(s: String): IntArray {
        val res = IntArray(s.length + 1)

        var low = 0
        var high = res.size - 1
        for (i in s.indices) {
            if (s[i] == 'D') {
                res[i] = high--
            } else {
                res[i] = low++
            }
        }
        res[res.size - 1] = low

        return res
    }
}
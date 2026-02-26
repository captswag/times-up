package leetcode._3168

class Solution {

    fun minimumChairs(s: String): Int {
        var cnt = 0
        var mx = 0

        for (c in s) {
            if (c == 'E') {
                cnt++
                if (cnt > mx) {
                    mx = cnt
                }
            } else {
                cnt--
            }
        }

        return mx
    }
}
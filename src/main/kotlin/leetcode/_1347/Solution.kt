package leetcode._1347

class Solution {

    fun minSteps(s: String, t: String): Int {
        val cnt = IntArray(26)

        for (i in s.indices) {
            cnt[s[i] - 'a']++
            cnt[t[i] - 'a']--
        }

        var ans = 0
        for (x in cnt) {
            if (x > 0) {
                ans += x
            }
        }

        return ans
    }
}
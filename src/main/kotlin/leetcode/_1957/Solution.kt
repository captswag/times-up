package leetcode._1957

class Solution {

    fun makeFancyString(s: String): String {
        val a = CharArray(s.length)
        var sz = 0
        a[sz++] = s[0]
        var cnt = 1

        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                cnt++
                if (cnt < 3) {
                    a[sz++] = s[i]
                }
            } else {
                cnt = 1
                a[sz++] = s[i]
            }
        }

        return String(a, 0, sz)
    }
}
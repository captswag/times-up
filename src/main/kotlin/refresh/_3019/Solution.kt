package refresh._3019

class Solution {

    fun countKeyChanges(s: String): Int {
        var cnt = 0

        for (i in 1 until s.length) {
            if (s[i].lowercaseChar() != s[i - 1].lowercaseChar()) {
                cnt++
            }
        }

        return cnt
    }
}
package leetcode._3114

class Solution {

    fun findLatestTime(s: String): String {
        val c = s.toCharArray()

        if (c[0] == '?') {
            if (c[1] == '?') {
                c[0] = '1'
            } else if (c[1] - '0' > 1) {
                c[0] = '0'
            } else {
                c[0] = '1'
            }
        }

        if (c[1] == '?') {
            if (c[0] == '0') {
                c[1] = '9'
            } else {
                c[1] = '1'
            }
        }

        if (c[3] == '?') {
            c[3] = '5'
        }

        if (c[4] == '?') {
            c[4] = '9'
        }

        return String(c)
    }
}
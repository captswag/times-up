package refresh._434

class Solution {

    fun countSegments(s: String): Int {
        var i = 0
        var cnt = 0

        while (i < s.length) {
            while (i < s.length && s[i] == ' ') {
                i++
            }

            val j = i
            while (i < s.length && s[i] != ' ') {
                i++
            }

            if (i - j > 0) {
                cnt++
            }
        }

        return cnt
    }
}
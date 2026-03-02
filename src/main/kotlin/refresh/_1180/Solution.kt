package refresh._1180

class Solution {

    fun countLetters(s: String): Int {
        var i = 0
        var cnt = 0

        while (i < s.length) {
            val j = i
            while (i < s.length && s[i] == s[j]) {
                i++
            }

            val len = i - j
            cnt += (len * (len + 1)) / 2
        }

        return cnt
    }
}
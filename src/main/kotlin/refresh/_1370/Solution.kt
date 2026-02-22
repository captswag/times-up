package refresh._1370

class Solution {

    fun sortString(s: String): String {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a']++
        }

        val res = CharArray(s.length)
        var i = 0
        var v = 0
        var dir = 1

        while (i < res.size) {
            if (freq[v] > 0) {
                res[i] = (v + 'a'.code).toChar()
                i++
                freq[v]--
            }
            v += dir
            if (v == -1 || v == 26) {
                dir = -dir
                v += dir
            }
        }

        return String(res)
    }
}
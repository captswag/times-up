package refresh._2138

class Solution {

    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val size = if (s.length % k > 0) {
            (s.length / k) + 1
        } else {
            s.length / k
        }
        val res = Array(size) { "" }
        var resIndex = 0

        var i = 0
        while (i < s.length) {
            val c = CharArray(k)
            var j = 0
            while (i < s.length && j < k) {
                c[j++] = s[i++]
            }
            while (j < c.size) {
                c[j++] = fill
            }
            res[resIndex++] = String(c)
        }

        return res
    }
}
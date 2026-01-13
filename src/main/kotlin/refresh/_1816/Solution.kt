package refresh._1816

class Solution {

    fun truncateSentence(s: String, k: Int): String {
        var count = 0
        var i = 0
        val res = StringBuilder()

        while (count < k) {
            while (i < s.length && s[i] != ' ') {
                res.append(s[i++])
            }
            count++
            if (count != k) {
                res.append(' ')
            }
            i++
        }

        return res.toString()
    }
}
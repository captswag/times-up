package refresh._3541

class Solution {

    fun maxFreqSum(s: String): Int {
        val freq = IntArray(26)
        var mv = 0
        var mc = 0

        for (c in s) {
            val cur = ++freq[c - 'a']

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if (cur > mv) {
                    mv = cur
                }
            } else {
                if (cur > mc) {
                    mc = cur
                }
            }
        }

        return mv + mc
    }
}
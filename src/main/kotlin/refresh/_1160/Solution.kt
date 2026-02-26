package refresh._1160

class Solution {

    fun countCharacters(words: Array<String>, chars: String): Int {
        val freq = IntArray(26)
        for (c in chars) {
            freq[c - 'a']++
        }

        var ans = 0
        for (s in words) {
            val tmp = IntArray(26)
            for (c in s) {
                tmp[c - 'a']++
            }

            var ok = true
            for (i in freq.indices) {
                if (freq[i] - tmp[i] < 0) {
                    ok = false
                    break
                }
            }

            if (ok) {
                ans += s.length
            }
        }

        return ans
    }
}
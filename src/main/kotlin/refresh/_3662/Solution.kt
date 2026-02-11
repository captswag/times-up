package refresh._3662

class Solution {

    fun filterCharacters(s: String, k: Int): String {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a']++
        }

        val sb = StringBuilder()
        for (c in s) {
            if (freq[c - 'a'] < k) {
                sb.append(c)
            }
        }

        return sb.toString()
    }
}
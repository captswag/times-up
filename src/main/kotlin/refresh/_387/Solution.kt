package refresh._387

class Solution {

    fun firstUniqChar(s: String): Int {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a']++
        }

        for (i in s.indices) {
            if (freq[s[i] - 'a'] == 1) {
                return i
            }
        }

        return -1
    }
}
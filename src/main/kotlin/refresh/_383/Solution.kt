package refresh._383

class Solution {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val freq = IntArray(26)

        for (c in magazine) {
            freq[c - 'a']++
        }

        for (c in ransomNote) {
            freq[c - 'a']--
            if (freq[c - 'a'] < 0) {
                return false
            }
        }

        return true
    }
}
package refresh._242

class Solution {

    fun isAnagram(s: String, t: String): Boolean {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a']++
        }

        for (c in t) {
            freq[c - 'a']--
        }

        for (x in freq) {
            if (x != 0) {
                return false
            }
        }

        return true
    }
}
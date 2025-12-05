package leetcode._242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        for (c in t) {
            frequency[c - 'a']--
        }

        for (f in frequency) {
            if (f != 0) {
                return false
            }
        }

        return true
    }
}
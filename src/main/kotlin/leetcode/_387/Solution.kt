package leetcode._387

class Solution {
    fun firstUniqChar(s: String): Int {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        for (index in s.indices) {
            if (frequency[s[index] - 'a'] == 1) {
                return index
            }
        }

        return -1
    }
}
package leetcode._387

class Solution {
    fun firstUniqChar(s: String): Int {
        val sCharArray = IntArray(26)

        for (c in s) {
            sCharArray[c - 'a']++
        }

        var firstUniqCharIndex = -1
        for (index in s.indices) {
            if (sCharArray[s[index] - 'a'] == 1) {
                firstUniqCharIndex = index
                break
            }
        }

        return firstUniqCharIndex
    }
}
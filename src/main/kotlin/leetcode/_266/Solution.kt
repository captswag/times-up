package leetcode._266

class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        var oddCount = 0
        for (f in frequency) {
            if (f and 1 == 1) {
                oddCount++
                if (oddCount == 2) {
                    return false
                }
            }
        }

        return true
    }
}
package leetcode._383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var canConstruct = true
        val magazineCharCount = IntArray(26)

        for (char in magazine) {
            magazineCharCount[char - 'a']++
        }

        for (char in ransomNote) {
            val charIndex = char - 'a'
            magazineCharCount[charIndex]--
            if (magazineCharCount[charIndex] < 0) {
                canConstruct = false
                break
            }
        }

        return canConstruct
    }
}
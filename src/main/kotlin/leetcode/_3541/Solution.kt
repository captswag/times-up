package leetcode._3541

class Solution {

    fun maxFreqSum(s: String): Int {
        val charCountArray = IntArray(26)
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var maxVowelCount = 0
        var maxConsonantCount = 0

        for (c in s) {
            val index = c - 'a'
            val count = ++charCountArray[index]
            if (c in vowels) {
                maxVowelCount = Math.max(maxVowelCount, count)
            } else {
                maxConsonantCount = Math.max(maxConsonantCount, count)
            }
        }

        return maxVowelCount + maxConsonantCount
    }
}
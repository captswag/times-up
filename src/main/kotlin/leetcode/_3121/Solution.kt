package leetcode._3121

class Solution {

    fun numberOfSpecialChars(word: String): Int {
        val last = IntArray(26) { -1 }

        for (i in word.indices) {
            if (word[i].isLowerCase()) {
                last[word[i] - 'a'] = i
            }
        }

        val seen = BooleanArray(26)
        var cnt = 0

        for (i in word.indices) {
            val j = word[i] - 'A'
            if (word[i].isUpperCase() && !seen[j]) {
                if (last[j] != -1 && last[j] < i) {
                    cnt++
                }
                seen[j] = true
            }
        }

        return cnt
    }
}
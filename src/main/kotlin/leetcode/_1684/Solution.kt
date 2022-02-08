package leetcode._1684

class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var output = 0
        val allowedBooleanArray = BooleanArray(26)

        for (c in allowed) {
            allowedBooleanArray[c - 'a'] = true
        }

        for (word in words) {
            val wordBooleanArray = BooleanArray(26)

            for (c in word) {
                wordBooleanArray[c - 'a'] = true
            }

            var consistent = true
            for (index in 0 until 26) {
                if (wordBooleanArray[index] && !allowedBooleanArray[index]) {
                    consistent = false
                    break
                }
            }

            if (consistent) {
                output++
            }
        }

        return output
    }
}
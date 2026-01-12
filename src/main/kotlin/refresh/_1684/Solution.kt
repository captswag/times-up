package refresh._1684

class Solution {

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedChars = BooleanArray(26)
        for (c in allowed) {
            allowedChars[c - 'a'] = true
        }

        var count = 0
        for (word in words) {
            var i = 0
            while (i < word.length) {
                if (!allowedChars[word[i] - 'a']) {
                    break
                }
                i++
            }
            if (i == word.length) {
                count++
            }
        }

        return count
    }
}
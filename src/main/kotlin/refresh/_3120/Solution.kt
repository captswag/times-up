package refresh._3120

class Solution {

    fun numberOfSpecialChars(word: String): Int {
        val seen = BooleanArray(52)

        for (c in word) {
            if (c.isLowerCase()) {
                seen[c - 'a'] = true
            } else {
                seen[c - '\''] = true
            }
        }

        var count = 0
        for (index in 0 until 26) {
            if (seen[index] && seen[index + 26]) {
                count++
            }
        }

        return count
    }
}
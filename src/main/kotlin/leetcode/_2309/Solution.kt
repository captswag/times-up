package leetcode._2309

class Solution {
    fun greatestLetter(s: String): String {
        val seen = BooleanArray(52)

        for (c in s) {
            if (c.isLowerCase()) {
                seen[c - 'a'] = true
            } else {
                seen[c - '\''] = true
            }
        }

        for (index in seen.size - 1 downTo 26) {
            if (seen[index] && seen[index - 26]) {
                return (index + 39).toChar().toString()
            }
        }

        return ""
    }
}
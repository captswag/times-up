package leetcode._290

class Solution {

    fun wordPattern(pattern: String, s: String): Boolean {
        var i = 0
        var j = 0
        val sb = StringBuilder()
        val c2w = mutableMapOf<Char, String>()
        val w2c = mutableMapOf<String, Char>()

        while (i < pattern.length && j < s.length) {
            while (j < s.length && s[j] != ' ') {
                sb.append(s[j])
                j++
            }

            val word = sb.toString()
            sb.setLength(0)

            if (c2w.containsKey(pattern[i]) && w2c.containsKey(word)) {
                if (c2w.getValue(pattern[i]) != word || w2c.getValue(word) != pattern[i]) {
                    return false
                }
            } else if (c2w.containsKey(pattern[i]) || w2c.containsKey(word)) {
                return false
            } else {
                c2w[pattern[i]] = word
                w2c[word] = pattern[i]
            }

            i++
            j++
        }

        return i == pattern.length && j == s.length + 1
    }
}
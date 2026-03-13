package refresh._1961

class Solution {

    fun isPrefixString(s: String, words: Array<String>): Boolean {
        var i = 0

        for (t in words) {
            var j = 0

            while (i < s.length && j < t.length) {
                if (s[i] != t[j]) {
                    return false
                }
                i++
                j++
            }

            if (i == s.length) {
                return j == t.length
            }
        }

        return false
    }
}
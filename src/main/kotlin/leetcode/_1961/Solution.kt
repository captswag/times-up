package leetcode._1961

class Solution {

    fun isPrefixString(s: String, words: Array<String>): Boolean {
        var i = 0
        for (word in words) {
            var j = 0
            while (j < word.length) {
                if (s[i] == word[j]) {
                    i++
                } else {
                    return false
                }
                j++
                if (i == s.length) {
                    return j == word.length
                }
            }
        }

        return false
    }
}
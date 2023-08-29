package leetcode._2828

class Solution {

    fun isAcronym(words: List<String>, s: String): Boolean {
        var acronym = true
        if (words.size == s.length) {
            for (index in words.indices) {
                if (words[index][0] != s[index]) {
                    acronym = false
                    break
                }
            }
        } else {
            acronym = false
        }
        return acronym
    }
}
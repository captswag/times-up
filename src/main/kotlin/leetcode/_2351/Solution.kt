package leetcode._2351

class Solution {
    fun repeatedCharacter(s: String): Char {
        val checkArray = BooleanArray(26)
        var output = '?'

        for (c in s) {
            if (checkArray[c - 'a']) {
                output = c
                break
            } else {
                checkArray[c - 'a'] = true
            }
        }

        return output
    }
}
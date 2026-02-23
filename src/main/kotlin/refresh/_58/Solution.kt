package refresh._58

class Solution {

    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1

        while (s[i] == ' ') {
            i--
        }

        val j = i
        while (i > -1 && s[i] != ' ') {
            i--
        }

        return j - i
    }
}
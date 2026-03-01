package refresh._2124

class Solution {

    fun checkString(s: String): Boolean {
        var i = 0

        while (i < s.length && s[i] == 'a') {
            i++
        }

        while (i < s.length && s[i] == 'b') {
            i++
        }

        return i == s.length
    }
}
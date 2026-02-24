package refresh._389

class Solution {

    fun findTheDifference(s: String, t: String): Char {
        var res = t[t.length - 1] - 'a'

        for (i in s.indices) {
            res = res xor (s[i] - 'a') xor (t[i] - 'a')
        }

        return (res + 'a'.code).toChar()
    }
}
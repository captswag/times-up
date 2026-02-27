package refresh._2042

class Solution {

    fun areNumbersAscending(s: String): Boolean {
        var i = 0
        var prev = 0

        while (i < s.length) {
            if (s[i].isDigit()) {
                var cur = 0
                while (i < s.length && s[i].isDigit()) {
                    cur = (cur * 10) + (s[i] - '0')
                    i++
                }

                if (cur <= prev) {
                    return false
                }
                prev = cur
            } else {
                i++
            }
        }

        return true
    }
}
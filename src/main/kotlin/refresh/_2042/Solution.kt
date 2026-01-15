package refresh._2042

class Solution {

    fun areNumbersAscending(s: String): Boolean {
        var i = 0
        var prev = -1

        while (i < s.length) {
            if (s[i].isDigit()) {
                var number = s[i] - '0'
                i++
                while (i < s.length && s[i].isDigit()) {
                    number *= 10
                    number += (s[i] - '0')
                    i++
                }
                if (prev == -1 || number > prev) {
                    prev = number
                } else {
                    return false
                }
            }
            i++
        }

        return true
    }
}
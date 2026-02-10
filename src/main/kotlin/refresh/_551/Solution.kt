package refresh._551

class Solution {

    fun checkRecord(s: String): Boolean {
        var cntA = 0
        var i = 0

        while (i < s.length) {
            if (s[i] == 'L') {
                var j = i + 1
                while (j < s.length && s[j] == 'L') {
                    j++
                }
                if (j - i > 2) {
                    return false
                }
                i = j
            } else {
                if (s[i] == 'A') {
                    cntA++
                    if (cntA == 2) {
                        return false
                    }
                }
                i++
            }
        }

        return true
    }
}
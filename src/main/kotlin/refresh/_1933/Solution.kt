package refresh._1933

class Solution {

    fun isDecomposable(s: String): Boolean {
        var i = 0
        var usedTwo = false

        while (i < s.length) {
            val j = i
            while (i < s.length && s[i] == s[j]) {
                i++
            }
            if ((i - j) % 3 == 1) {
                return false
            } else if ((i - j) % 3 == 2) {
                if (usedTwo) {
                    return false
                } else {
                    usedTwo = true
                }
            }
        }

        return usedTwo
    }
}
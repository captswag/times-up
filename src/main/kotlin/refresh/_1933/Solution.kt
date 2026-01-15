package refresh._1933

class Solution {

    fun isDecomposable(s: String): Boolean {
        var i = 0
        var usedTwo = false

        while (i < s.length) {
            var j = i
            while (j < s.length && s[i] == s[j]) {
                j++
            }
            val count = j - i
            if (count % 3 == 2) {
                if (usedTwo) {
                    return false
                } else {
                    usedTwo = true
                }
            } else if (count % 3 != 0) {
                return false
            }
            i = j
        }

        return usedTwo
    }
}
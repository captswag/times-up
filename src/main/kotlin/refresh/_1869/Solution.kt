package refresh._1869

class Solution {

    fun checkZeroOnes(s: String): Boolean {
        var i = 0
        var longestZero = 0
        var longestOne = 0

        while (i < s.length) {
            var currRun = 0
            if (s[i] == '0') {
                while (i < s.length && s[i] == '0') {
                    currRun++
                    i++
                }
                if (currRun > longestZero) {
                    longestZero = currRun
                }
            } else {
                while (i < s.length && s[i] == '1') {
                    currRun++
                    i++
                }
                if (currRun > longestOne) {
                    longestOne = currRun
                }
            }
        }

        return longestOne > longestZero
    }
}
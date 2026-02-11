package refresh._3813

class Solution {

    fun vowelConsonantScore(s: String): Int {
        var cntV = 0
        var cntC = 0

        for (c in s) {
            if (c.isLetter()) {
                if (isVowel(c)) {
                    cntV++
                } else {
                    cntC++
                }
            }
        }

        return if (cntC == 0) {
            0
        } else {
            cntV / cntC
        }
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}
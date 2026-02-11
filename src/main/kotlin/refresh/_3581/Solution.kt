package refresh._3581

class Solution {

    fun countOddLetters(n: Int): Int {
        val sb = StringBuilder()
        var x = n

        while (x != 0) {
            sb.append(digitToWord(x % 10))
            x /= 10
        }

        val freq = IntArray(26)
        for (c in sb) {
            freq[c - 'a']++
        }

        var cnt = 0
        for (f in freq) {
            if (f and 1 == 1) {
                cnt++
            }
        }

        return cnt
    }

    private fun digitToWord(d: Int): String {
        return when (d) {
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            else -> "nine"
        }
    }
}
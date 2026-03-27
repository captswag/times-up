package refresh._3581

class Solution {

    fun countOddLetters(n: Int): Int {
        var x = n
        val cnt = IntArray(26)

        while (x > 0) {
            val s = digitToWord(x % 10)
            for (c in s) {
                cnt[c - 'a']++
            }
            x /= 10
        }

        var ans = 0
        for (i in cnt.indices) {
            if (cnt[i] and 1 == 1) {
                ans++
            }
        }

        return ans
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
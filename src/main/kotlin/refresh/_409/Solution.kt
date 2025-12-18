package refresh._409

class Solution {

    fun longestPalindrome(s: String): Int {
        val frequency = IntArray(52)

        for (c in s) {
            if (c.isLowerCase()) {
                frequency[c - 'a']++
            } else {
                frequency[c - '\'']++
            }
        }

        var length = 0
        var hasOddFrequency = false
        for (f in frequency) {
            if (f and 1 == 0) {
                length += f
            } else {
                hasOddFrequency = true
                length += (f - 1)
            }
        }

        return if (hasOddFrequency) {
            length + 1
        } else {
            length
        }
    }
}
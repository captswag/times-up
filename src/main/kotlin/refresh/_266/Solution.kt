package refresh._266

class Solution {

    fun canPermutePalindrome(s: String): Boolean {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a']++
        }

        var odd = 0
        for (f in freq) {
            if (f and 1 == 1) {
                odd++
            }
        }

        return odd == 1 || odd == 0
    }
}
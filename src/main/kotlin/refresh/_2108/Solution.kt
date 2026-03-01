package refresh._2108

class Solution {

    fun firstPalindrome(words: Array<String>): String {
        for (w in words) {
            var l = 0
            var r = w.length - 1

            while (l < r) {
                if (w[l] != w[r]) {
                    break
                }
                l++
                r--
            }

            if (l >= r) {
                return w
            }
        }

        return ""
    }
}
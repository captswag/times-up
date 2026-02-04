package refresh._2697

class Solution {

    fun makeSmallestPalindrome(s: String): String {
        val a = s.toCharArray()

        var l = 0
        var r = a.size - 1

        while (l < r) {
            if (a[l] != a[r]) {
                if (a[l] < a[r]) {
                    a[r] = a[l]
                } else {
                    a[l] = a[r]
                }
            }
            l++
            r--
        }

        return String(a)
    }
}
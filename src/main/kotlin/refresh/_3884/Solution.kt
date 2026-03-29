package refresh._3884

class Solution {

    fun firstMatchingIndex(s: String): Int {
        var l = 0
        var r = s.length - 1

        while (l <= r) {
            if (s[l] == s[r]) {
                return l
            }
            l++
            r--
        }

        return -1
    }
}
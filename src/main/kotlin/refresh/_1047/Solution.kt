package refresh._1047

class Solution {

    fun removeDuplicates(s: String): String {
        val ans = CharArray(s.length)
        var size = 0

        for (i in s.indices) {
            if (size > 0 && ans[size - 1] == s[i]) {
                size--
            } else {
                ans[size++] = s[i]
            }
        }

        return String(ans, 0, size)
    }
}
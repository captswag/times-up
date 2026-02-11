package refresh._3798

class Solution {

    fun largestEven(s: String): String {
        for (i in s.indices.reversed()) {
            if (s[i] == '2') {
                return s.substring(0, i + 1)
            }
        }

        return ""
    }
}
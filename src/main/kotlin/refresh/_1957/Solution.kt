package refresh._1957

class Solution {

    fun makeFancyString(s: String): String {
        val res = StringBuilder()

        var i = 0
        while (i < s.length) {
            var j = i
            while (j < s.length && s[i] == s[j]) {
                if (j - i + 1 < 3) {
                    res.append(s[j])
                }
                j++
            }
            i = j
        }

        return res.toString()
    }
}
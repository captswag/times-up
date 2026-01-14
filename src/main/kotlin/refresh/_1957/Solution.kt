package refresh._1957

class Solution {

    fun makeFancyString(s: String): String {
        val res = StringBuilder()

        var i = 0
        res.append(s[i])
        var count = 1
        i++

        while (i < s.length) {
            if (s[i] == s[i - 1]) {
                count++
                if (count < 3) {
                    res.append(s[i])
                }
            } else {
                res.append(s[i])
                count = 1
            }
            i++
        }

        return res.toString()
    }
}
package refresh._1309

class Solution {

    fun freqAlphabets(s: String): String {
        var i = s.length - 1
        val res = StringBuilder()

        while (i > -1) {
            if (s[i].isDigit()) {
                res.append((((s[i] - '0') - 1) + 'a'.code).toChar())
                i--
            } else {
                i--
                var num = s[i] - '0'
                i--
                num += ((s[i] - '0') * 10)
                res.append(((num - 1) + 'a'.code).toChar())
                i--
            }
        }

        return res.reverse().toString()
    }
}
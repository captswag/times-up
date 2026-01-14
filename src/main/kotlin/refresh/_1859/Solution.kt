package refresh._1859

class Solution {

    fun sortSentence(s: String): String {
        var i = 0
        val sb = StringBuilder()
        val map = mutableMapOf<Int, String>()

        while (i < s.length) {
            while (i < s.length && s[i].isLetter()) {
                sb.append(s[i++])
            }
            map[s[i] - '0'] = sb.toString()
            sb.setLength(0)
            i += 2
        }

        var key = 1
        val res = CharArray(s.length - map.size)
        var resIndex = 0
        while (map.containsKey(key)) {
            if (key != 1) {
                res[resIndex++] = ' '
            }
            val word = map.getValue(key)
            for (c in word) {
                res[resIndex++] = c
            }
            key++
        }

        return String(res)
    }
}
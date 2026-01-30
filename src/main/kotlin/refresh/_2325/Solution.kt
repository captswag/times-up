package refresh._2325

class Solution {

    fun decodeMessage(key: String, message: String): String {
        var next = 'a'
        val map = CharArray(26)

        for (c in key) {
            if (c.isLetter() && map[c - 'a'] == '\u0000') {
                map[c - 'a'] = next
                next += 1
            }
        }

        val res = CharArray(message.length)
        var resIndex = 0
        for (c in message) {
            if (c.isLetter()) {
                res[resIndex++] = map[c - 'a']
            } else {
                res[resIndex++] = c
            }
        }

        return String(res)
    }
}
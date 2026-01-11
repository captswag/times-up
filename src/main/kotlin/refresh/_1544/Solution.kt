package refresh._1544

class Solution {

    fun makeGood(s: String): String {
        val res = StringBuilder()

        for (i in s.indices) {
            if (res.isEmpty()) {
                res.append(s[i])
            } else {
                if (res.last().code + 32 == s[i].code || res.last().code == s[i].code + 32) {
                    res.setLength(res.length - 1)
                } else {
                    res.append(s[i])
                }
            }
        }

        return res.toString()
    }
}
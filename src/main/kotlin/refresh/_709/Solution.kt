package refresh._709

class Solution {

    fun toLowerCase(s: String): String {
        val res = s.toCharArray()

        for (i in res.indices) {
            if (res[i].isUpperCase()) {
                res[i] = res[i].lowercaseChar()
            }
        }

        return String(res)
    }
}
package refresh._3174

class Solution {

    fun clearDigits(s: String): String {
        val ans = StringBuilder()

        for (c in s) {
            if (c.isDigit()) {
                ans.setLength(ans.length - 1)
            } else {
                ans.append(c)
            }
        }

        return ans.toString()
    }
}
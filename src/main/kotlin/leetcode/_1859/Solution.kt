package leetcode._1859

class Solution {
    fun sortSentence(s: String): String {
        val sb = StringBuilder()
        val map = mutableMapOf<Int, String>()
        var maxDigit = -1

        for (c in s) {
            if (c.isDigit()) {
                val digit = Character.getNumericValue(c)
                map[digit] = sb.toString()
                if (digit > maxDigit) {
                    maxDigit = digit
                }
                sb.clear()
            } else if (c == ' ') {
                // Ignore
            } else {
                sb.append(c)
            }
        }

        // Now we have the map
        for (index in 1..maxDigit) {
            sb.append(map[index])
            if (index != maxDigit) {
                sb.append(" ")
            }
        }

        return sb.toString()
    }
}
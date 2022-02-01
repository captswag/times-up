package leetcode._1945

class Solution {
    fun getLucky(s: String, k: Int): Int {
        val sb = StringBuilder()

        for (c in s) {
            sb.append(c - 'a' + 1)
        }

        var convertString = sb.toString()

        for (i in 0 until k) { // We iterate k number of times
            if (convertString.length == 1) {
                break
            }
            var sum = 0
            for (c in convertString) {
                sum += Character.getNumericValue(c)
            }
            convertString = sum.toString()
        }

        return convertString.toInt()
    }
}
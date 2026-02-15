package leetcode._3838

class Solution {

    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        val a = CharArray(words.size)
        var i = 0

        for (x in words) {
            var sum = 0

            for (c in x) {
                sum += weights[c - 'a']
            }

            sum %= 26
            sum = (25 - sum)
            a[i++] = (sum + 'a'.code).toChar()
        }

        return String(a)
    }
}
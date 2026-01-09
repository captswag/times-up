package refresh._1422

class Solution {

    fun maxScore(s: String): Int {
        var left = if (s[0] == '0') 1 else 0

        var right = 0
        for (index in 1 until s.length) {
            if (s[index] == '1') {
                right++
            }
        }

        var maxScore = left + right

        for (index in 1 until s.length - 1) {
            if (s[index] == '0') {
                left++
            } else {
                right--
            }
            val currScore = left + right
            if (currScore > maxScore) {
                maxScore = currScore
            }
        }

        return maxScore
    }
}
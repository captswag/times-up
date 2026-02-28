package leetcode._3184

class Solution {

    fun countCompleteDayPairs(hours: IntArray): Int {
        var ans = 0
        val freq = IntArray(24)

        for (i in hours.indices) {
            val rem = hours[i] % 24
            ans += if (rem == 0) {
                freq[rem]
            } else {
                freq[24 - rem]
            }
            freq[rem]++
        }

        return ans
    }
}
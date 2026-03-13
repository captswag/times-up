package refresh._2006

class Solution {

    fun countKDifference(nums: IntArray, k: Int): Int {
        val cnt = IntArray(101)
        var ans = 0

        for (x in nums) {
            if (x + k < 101 && cnt[x + k] > 0) {
                ans += cnt[x + k]
            }

            if (x - k >= 0 && cnt[x - k] > 0) {
                ans += cnt[x - k]
            }

            cnt[x]++
        }

        return ans
    }
}
package refresh._3005

class Solution {

    fun maxFrequencyElements(nums: IntArray): Int {
        val cnt = IntArray(101)
        var mx = 0
        var ans = 0

        for (x in nums) {
            cnt[x]++
            if (cnt[x] > mx) {
                mx = cnt[x]
                ans = mx
            } else if (cnt[x] == mx) {
                ans += mx
            }
        }

        return ans
    }
}
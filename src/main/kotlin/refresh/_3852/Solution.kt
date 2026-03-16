package refresh._3852

class Solution {

    fun minDistinctFreqPair(nums: IntArray): IntArray {
        var i = 0
        val cnt = IntArray(101)
        cnt[nums[i]]++
        var mn = nums[i]
        i++

        while (i < nums.size) {
            cnt[nums[i]]++
            if (nums[i] < mn) {
                mn = nums[i]
            }
            i++
        }

        for (j in mn + 1 until cnt.size) {
            if (cnt[j] > 0 && cnt[j] != cnt[mn]) {
                return intArrayOf(mn, j)
            }
        }

        return intArrayOf(-1, -1)
    }
}
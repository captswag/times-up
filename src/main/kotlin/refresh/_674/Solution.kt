package refresh._674

class Solution {

    fun findLengthOfLCIS(nums: IntArray): Int {
        var cur = 1
        var mx = cur

        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                cur++
                if (cur > mx) {
                    mx = cur
                }
            } else {
                cur = 1
            }
        }

        return mx
    }
}
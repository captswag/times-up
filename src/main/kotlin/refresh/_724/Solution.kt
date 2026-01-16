package refresh._724

class Solution {

    fun pivotIndex(nums: IntArray): Int {
        var right = 0
        for (i in 1 until nums.size) {
            right += nums[i]
        }

        if (right == 0) {
            return 0
        } else {
            var left = 0
            for (i in 1 until nums.size) {
                left += nums[i - 1]
                right -= nums[i]
                if (left == right) {
                    return i
                }
            }
            return -1
        }
    }
}
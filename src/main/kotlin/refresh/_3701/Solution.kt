package refresh._3701

class Solution {

    fun alternatingSum(nums: IntArray): Int {
        var sum = 0

        for (i in nums.indices) {
            if (i and 1 == 0) {
                sum += nums[i]
            } else {
                sum -= nums[i]
            }
        }

        return sum
    }
}
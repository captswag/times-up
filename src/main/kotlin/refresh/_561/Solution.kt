package refresh._561

class Solution {

    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()

        var ans = 0
        for (i in nums.indices step 2) {
            ans += nums[i]
        }

        return ans
    }
}
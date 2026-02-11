package refresh._3745

class Solution {

    fun maximizeExpressionOfThree(nums: IntArray): Int {
        var mx: Int
        var smx: Int
        var mn: Int

        if (nums[0] > nums[1]) {
            mx = nums[0]
            smx = nums[1]
            mn = nums[1]
        } else {
            mx = nums[1]
            smx = nums[0]
            mn = nums[0]
        }

        for (i in 2 until nums.size) {
            if (nums[i] > mx) {
                smx = mx
                mx = nums[i]
            } else if (nums[i] > smx) {
                smx = nums[i]
            } else if (nums[i] < mn) {
                mn = nums[i]
            }
        }

        return mx + smx - mn
    }
}
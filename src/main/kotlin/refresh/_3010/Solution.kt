package refresh._3010

class Solution {

    fun minimumCost(nums: IntArray): Int {
        var mn = 51
        var smn = 51

        for (i in 1 until nums.size) {
            if (nums[i] < mn) {
                smn = mn
                mn = nums[i]
            } else if (nums[i] < smn) {
                smn = nums[i]
            }
        }

        return nums[0] + mn + smn
    }
}
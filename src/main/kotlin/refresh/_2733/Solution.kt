package refresh._2733

class Solution {

    fun findNonMinOrMax(nums: IntArray): Int {
        var mn = nums[0]
        var mx = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] > mx) {
                mx = nums[i]
            } else if (nums[i] < mn) {
                mn = nums[i]
            }
        }

        for (num in nums) {
            if (num != mn && num != mx) {
                return num
            }
        }

        return -1
    }
}
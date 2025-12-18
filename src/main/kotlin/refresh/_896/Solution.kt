package refresh._896

class Solution {

    fun isMonotonic(nums: IntArray): Boolean {
        val isIncreasing = nums[nums.size - 1] > nums[0]

        for (index in 1 until nums.size) {
            if (isIncreasing) {
                if (nums[index] < nums[index - 1]) {
                    return false
                }
            } else {
                if (nums[index] > nums[index - 1]) {
                    return false
                }
            }
        }

        return true
    }
}
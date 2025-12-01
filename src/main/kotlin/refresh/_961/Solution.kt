package refresh._961

class Solution {

    fun repeatedNTimes(nums: IntArray): Int {
        for (index in 2 until nums.size) {
            if (nums[index] == nums[index - 2] || nums[index] == nums[index - 1]) {
                return nums[index]
            }
        }
        return nums[0]
    }
}
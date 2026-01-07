package refresh._1480

class Solution {

    fun runningSum(nums: IntArray): IntArray {
        for (index in 1 until nums.size) {
            nums[index] = nums[index] + nums[index - 1]
        }
        return nums
    }
}
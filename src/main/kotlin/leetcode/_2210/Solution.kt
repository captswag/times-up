package leetcode._2210

class Solution {

    fun countHillValley(nums: IntArray): Int {
        var length = 1

        for (index in 1 until nums.size) {
            if (nums[index] != nums[index - 1]) {
                nums[length++] = nums[index]
            }
        }

        var count = 0
        for (index in 1 until length - 1) {
            if ((nums[index] > nums[index - 1] && nums[index] > nums[index + 1]) || (nums[index] < nums[index - 1] && nums[index] < nums[index + 1])) {
                count++
            }
        }

        return count
    }
}
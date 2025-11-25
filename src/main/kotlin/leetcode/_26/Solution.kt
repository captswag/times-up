package leetcode._26

class Solution {

    fun removeDuplicates(nums: IntArray): Int {
        var size = 1

        for (index in 1 until nums.size) {
            if (nums[index] != nums[index - 1]) {
                nums[size++] = nums[index]
            }
        }

        return size
    }
}
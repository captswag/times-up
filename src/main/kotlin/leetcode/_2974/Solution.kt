package leetcode._2974

class Solution {

    fun numberGame(nums: IntArray): IntArray {
        nums.sort()
        for (index in 1 until nums.size step 2) {
            val temp = nums[index]
            nums[index] = nums[index - 1]
            nums[index - 1] = temp
        }
        return nums
    }
}
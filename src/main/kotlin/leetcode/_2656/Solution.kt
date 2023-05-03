package leetcode._2656

class Solution {

    fun maximizeSum(nums: IntArray, k: Int): Int {
        var max = nums[0]

        for (index in 1 until nums.size) {
            if (nums[index] > max) {
                max = nums[index]
            }
        }

        val highN = max + k - 1
        val highSum = (highN * (highN + 1)) / 2

        val lowN = max - 1
        val lowSum = (lowN * (lowN + 1)) / 2

        return highSum - lowSum
    }
}
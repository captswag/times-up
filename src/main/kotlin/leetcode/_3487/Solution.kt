package leetcode._3487

class Solution {

    fun maxSum(nums: IntArray): Int {
        val positiveNumsSet = mutableSetOf<Int>()

        for (num in nums) {
            if (num > 0) {
                positiveNumsSet.add(num)
            }
        }

        return if (positiveNumsSet.isEmpty()) {
            var max = nums[0]
            for (index in 1 until nums.size) {
                if (nums[index] > max) {
                    max = nums[index]
                }
            }
            max
        } else {
            var sum = 0
            for (num in positiveNumsSet) {
                sum += num
            }
            sum
        }
    }
}
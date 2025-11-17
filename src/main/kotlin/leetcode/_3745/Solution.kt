package leetcode._3745

class Solution {

    fun maximizeExpressionOfThree(nums: IntArray): Int {
        var min = nums[0]
        var max1Index = 0
        var max1 = nums[max1Index]

        for (index in 1 until nums.size) {
            if (nums[index] < min) {
                min = nums[index]
            }

            if (nums[index] > max1) {
                max1Index = index
                max1 = nums[max1Index]
            }
        }

        var max2 = if (max1Index == 0) {
            nums[1]
        } else {
            nums[0]
        }

        for (index in nums.indices) {
            if (index == max1Index) {
                continue
            } else {
                if (nums[index] > max2) {
                    max2 = nums[index]
                }
            }
        }

        return max1 + max2 - min
    }
}
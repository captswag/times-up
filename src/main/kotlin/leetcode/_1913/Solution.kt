package leetcode._1913

class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        var max = nums[0]
        var secondMax: Int
        if (nums[1] > max) {
            secondMax = max
            max = nums[1]
        } else {
            secondMax = nums[1]
        }
        var min = nums[0]
        var secondMin: Int
        if (nums[1] < min) {
            secondMin = min
            min = nums[1]
        } else {
            secondMin = nums[1]
        }
        for (index in 2 until nums.size) {
            if (nums[index] > max) {
                secondMax = max
                max = nums[index]
            } else if (nums[index] > secondMax) {
                secondMax = nums[index]
            }
            if (nums[index] < min) {
                secondMin = min
                min = nums[index]
            } else if (nums[index] < secondMin) {
                secondMin = nums[index]
            }
        }

        return (max * secondMax) - (min * secondMin)
    }
}
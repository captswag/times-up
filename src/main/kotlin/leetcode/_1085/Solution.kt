package leetcode._1085

class Solution {
    fun sumOfDigits(nums: IntArray): Int {
        var index = 0
        var minNumber = nums[index]
        index++

        while (index < nums.size) {
            if (nums[index] < minNumber) {
                minNumber = nums[index]
            }
            index++
        }

        var output = 0
        while (minNumber != 0) {
            output += minNumber % 10
            minNumber /= 10
        }

        return if (output % 2 == 0) {
            1
        } else {
            0
        }
    }
}
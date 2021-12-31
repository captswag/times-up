package leetcode._268

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var smallest = nums[0] // Given that the array size ranges from 1..10^4
        var largest = nums[0]

        var actualSum = nums[0]
        for (index in 1 until nums.size) {
            if (nums[index] < smallest) {
                smallest = nums[index]
            }
            if (nums[index] > largest) {
                largest = nums[index]
            }
            actualSum += nums[index]
        }

        // Now we have both smallest and largest
        var expectedSum = 0
        for (value in smallest..largest) {
            expectedSum += value
        }

        val diff = expectedSum - actualSum

        return if (diff == 0) {
            if (smallest != 0) {
                0
            } else {
                largest + 1
            }
        } else {
            diff
        }
    }
}
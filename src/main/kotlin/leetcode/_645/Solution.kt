package leetcode._645

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val set = mutableSetOf<Int>()
        val output = IntArray(2)
        var duplicate: Int? = null

        for (num in nums) {
            if (set.contains(num)) {
                duplicate = num
                break
            } else {
                set.add(num)
            }
        }

        // Since I got the duplicate, now we calculate the sum of all the characters - the duplicate
        var max = nums[0]
        var actualSum = nums[0]

        for (index in 1 until nums.size) {
            if (nums[index] > max) {
                max = nums[index]
            }
            actualSum += nums[index]
        }

        if (duplicate != null) {
            output[0] = duplicate
            actualSum -= duplicate
        }

        val expectedSum = (max * (max + 1)) / 2
        // Find the missing number based on actualSum and expectedSum
        val diff = expectedSum - actualSum

        val missingNumber = if (diff == 0) {
            max + 1
        } else {
            diff
        }
        output[1] = missingNumber

        return output
    }
}
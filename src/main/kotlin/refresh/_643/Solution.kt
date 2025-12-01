package refresh._643

class Solution {

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var currSum = 0
        for (index in 0 until k) {
            currSum += nums[index]
        }
        var maxSum = currSum

        for (index in 1 until nums.size - k + 1) {
            currSum = currSum - nums[index - 1] + nums[index + k - 1]
            if (currSum > maxSum) {
                maxSum = currSum
            }
        }

        return maxSum.toDouble() / k
    }
}
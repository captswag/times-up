package refresh._1800

class Solution {

    fun maxAscendingSum(nums: IntArray): Int {
        var i = 0
        var currSum = nums[i]
        var maxSum = currSum
        i++

        while (i < nums.size) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i]
            } else {
                currSum = nums[i]
            }
            if (currSum > maxSum) {
                maxSum = currSum
            }
            i++
        }

        return maxSum
    }
}
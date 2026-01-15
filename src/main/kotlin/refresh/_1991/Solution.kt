package refresh._1991

class Solution {

    fun findMiddleIndex(nums: IntArray): Int {
        var rightSum = 0

        for (i in 1 until nums.size) {
            rightSum += nums[i]
        }

        if (rightSum == 0) {
            return 0
        } else {
            var leftSum = 0
            for (i in 1 until nums.size) {
                leftSum += nums[i - 1]
                rightSum -= nums[i]
                if (leftSum == rightSum) {
                    return i
                }
            }
        }

        return -1
    }
}
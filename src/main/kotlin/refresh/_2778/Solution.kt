package refresh._2778

class Solution {

    fun sumOfSquares(nums: IntArray): Int {
        var sum = 0

        for (i in nums.indices) {
            if (nums.size % (i + 1) == 0) {
                sum += (nums[i] * nums[i])
            }
        }

        return sum
    }
}
package refresh._3774

class Solution {

    fun absDifference(nums: IntArray, k: Int): Int {
        nums.sort()

        var sum1 = 0
        var sum2 = 0

        for (i in 0 until k) {
            sum1 += nums[i]
            sum2 += nums[nums.size - 1 - i]
        }

        return sum2 - sum1
    }
}
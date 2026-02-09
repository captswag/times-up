package refresh._3432

class Solution {

    fun countPartitions(nums: IntArray): Int {
        var sum = 0

        for (num in nums) {
            sum += num
        }

        var ls = 0
        var rs = sum

        var cnt = 0
        for (i in 0 until nums.size - 1) {
            ls += nums[i]
            rs -= nums[i]
            if ((ls - rs) and 1 == 0) {
                cnt++
            }
        }

        return cnt
    }
}
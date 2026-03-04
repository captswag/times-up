package refresh._1991

class Solution {

    fun findMiddleIndex(nums: IntArray): Int {
        var r = 0

        for (x in nums) {
            r += x
        }

        var pre = 0
        var l = 0

        for (i in nums.indices) {
            l += pre
            r -= nums[i]
            if (l == r) {
                return i
            }
            pre = nums[i]
        }

        return -1
    }
}
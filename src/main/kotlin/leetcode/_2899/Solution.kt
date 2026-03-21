package leetcode._2899

class Solution {

    fun lastVisitedIntegers(nums: IntArray): List<Int> {
        var k = 0
        val seen = IntArray(101)
        val ans = mutableListOf<Int>()
        var sz = 0

        for (i in nums.indices) {
            if (nums[i] == -1) {
                if (i == 0 || nums[i - 1] != -1) {
                    k = 1
                } else {
                    k++
                }
                if (sz - k >= 0) {
                    ans.add(seen[sz - k])
                } else {
                    ans.add(-1)
                }
            } else {
                seen[sz++] = nums[i]
            }
        }

        return ans
    }
}
package leetcode._3865

class Solution {

    fun reverseSubarrays(nums: IntArray, k: Int): IntArray {
        val sz = nums.size / k

        for (i in nums.indices step sz) {
            var l = i
            var r = i + sz - 1

            while (l < r) {
                val temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                l++
                r--
            }
        }

        return nums
    }
}
package leetcode._3173

class Solution {

    fun orArray(nums: IntArray): IntArray {
        val res = IntArray(nums.size - 1)

        for (index in 0 until nums.size - 1) {
            res[index] = nums[index] or nums[index + 1]
        }

        return res
    }
}
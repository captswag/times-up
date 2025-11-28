package leetcode._163

class Solution {

    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        if (nums.isEmpty()) {
            res.add(mutableListOf(lower, upper))
            return res
        }

        if (lower != nums[0]) {
            res.add(mutableListOf(lower, nums[0] - 1))
        }

        for (index in 0 until nums.size - 1) {
            if (nums[index] + 1 != nums[index + 1]) {
                res.add(mutableListOf(nums[index] + 1, nums[index + 1] - 1))
            }
        }

        if (nums[nums.size - 1] != upper) {
            res.add(mutableListOf(nums[nums.size - 1] + 1, upper))
        }

        return res
    }
}
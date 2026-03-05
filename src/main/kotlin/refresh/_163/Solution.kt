package refresh._163

class Solution {

    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        if (nums.isEmpty()) {
            res.add(listOf(lower, upper))
            return res
        }

        if (lower != nums[0]) {
            res.add(listOf(lower, nums[0] - 1))
        }

        for (i in 1 until nums.size) {
            if (nums[i - 1] + 1 != nums[i]) {
                res.add(listOf(nums[i - 1] + 1, nums[i] - 1))
            }
        }

        if (upper != nums[nums.size - 1]) {
            res.add(listOf(nums[nums.size - 1] + 1, upper))
        }

        return res
    }
}
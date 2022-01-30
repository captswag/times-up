package leetcode._448

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val set = mutableSetOf<Int>()
        val high = nums.size
        var missing = false

        for (num in nums) {
            if (set.contains(num)) {
                missing = true
            }
            set.add(num)
        }

        val output = mutableListOf<Int>()

        for (num in 1..high) {
            if (!set.contains(num)) {
                output.add(num)
            }
        }

        if (output.isEmpty() && missing) {
            output.add(high + 1)
        }

        return output
    }
}
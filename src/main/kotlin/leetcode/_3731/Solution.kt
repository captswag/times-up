package leetcode._3731

class Solution {

    fun findMissingElements(nums: IntArray): List<Int> {
        var min = 100
        var max = 1
        val seen = BooleanArray(101)

        for (num in nums) {
            min = Math.min(min, num)
            max = Math.max(max, num)
            seen[num] = true
        }

        val output = mutableListOf<Int>()
        for (num in min + 1 until max) {
            if (!seen[num]) {
                output.add(num)
            }
        }

        return output
    }
}
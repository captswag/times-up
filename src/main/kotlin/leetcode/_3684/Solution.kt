package leetcode._3684

class Solution {

    fun maxKDistinct(nums: IntArray, k: Int): IntArray {
        nums.sortDescending()
        val output = mutableListOf<Int>()

        var index = 0
        output.add(nums[index++])

        while (index < nums.size && output.size < k) {
            if (nums[index] != output[output.size - 1]) {
                output.add(nums[index])
            }
            index++
        }

        return output.toIntArray()
    }
}
package leetcode._1470

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val output = IntArray(2 * n)

        var oddIndex = 1

        for (index in n until nums.size) {
            output[oddIndex] = nums[index]
            oddIndex += 2
        }

        var evenIndex = 0
        for (index in 0 until n) {
            output[evenIndex] = nums[index]
            evenIndex += 2
        }

        return output
    }
}
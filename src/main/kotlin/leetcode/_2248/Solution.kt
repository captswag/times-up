package leetcode._2248

class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val countArray = IntArray(1000)

        for (rowIndex in nums.indices) {
            for (columnIndex in nums[rowIndex].indices) {
                countArray[nums[rowIndex][columnIndex] - 1]++
            }
        }

        val output = mutableListOf<Int>()
        for (index in countArray.indices) {
            if (countArray[index] == nums.size) {
                output.add(index + 1)
            }
        }

        return output
    }
}
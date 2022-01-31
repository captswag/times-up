package leetcode._80

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var prev = nums[0]
        var counter = 1
        var validIndexes = 1

        val absentNumber = nums[nums.size - 1] + 1

        // First part of the problem
        for (index in 1 until nums.size) {
            if (prev == nums[index]) {
                if (++counter > 2) {
                    nums[index] = absentNumber
                } else {
                    validIndexes++
                }
            } else {
                prev = nums[index]
                counter = 1
                validIndexes++
            }
        }

        // Second part of the problem
        var absentNumberIndex: Int? = null

        for (index in nums.indices) {
            if (nums[index] == absentNumber) {
                absentNumberIndex = absentNumberIndex ?: index
            } else {
                if (absentNumberIndex != null) {
                    // Swap the values
                    nums[absentNumberIndex] = nums[index]
                    nums[index] = nums[absentNumberIndex]
                    absentNumberIndex++
                }
            }
        }

        return validIndexes
    }
}
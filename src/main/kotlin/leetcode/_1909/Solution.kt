package leetcode._1909

class Solution {
    fun canBeIncreasing(nums: IntArray): Boolean {
        var previousFaultyIndex = 0
        var currentFaultyIndex = 0

        for (index in 1 until nums.size) {
            if (nums[index] <= nums[index - 1]) {
                // Either current index or the previousIndex is faulty
                previousFaultyIndex = index - 1
                currentFaultyIndex = index
            }
        }

        val count1 = checkForFaults(nums, previousFaultyIndex)
        val count2 = checkForFaults(nums, currentFaultyIndex)

        return count1 + count2 != 2
    }

    private fun checkForFaults(nums: IntArray, faultyIndex: Int): Int {
        var count = 0

        var previous = 0
        var current = 1

        if (current == faultyIndex) {
            current++
        } else if (previous == faultyIndex) {
            current++
            previous++
        }

        while (current < nums.size) {
            if (nums[current] <= nums[previous]) {
                count = 1
                break
            }

            current++
            previous++

            if (current == faultyIndex) {
                current++
            } else if (previous == faultyIndex) {
                previous++
            }
        }

        return count
    }
}
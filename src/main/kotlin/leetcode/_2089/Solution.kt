package leetcode._2089

class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        nums.sort() // This part really doesn't matter

        // First occurrence
        var low = 0
        var high = nums.size - 1

        var first = -1
        var last = -1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                first = mid
                // Go left
                high = mid - 1
            } else if (nums[mid] < target) {
                // Go right
                low = mid + 1
            } else {
                // Go left
                high = mid - 1
            }
        }

        low = 0
        high = nums.size - 1

        // Last occurrence
        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                last = mid
                // Go right
                low = mid + 1
            } else if (nums[mid] < target) {
                // Go right
                low = mid + 1
            } else {
                // Go left
                high = mid - 1
            }
        }

        val output = mutableListOf<Int>()

        if (first != -1) {
            for (index in first..last) {
                output.add(index)
            }
        }

        return output
    }
}
package leetcode._896

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var monotonic = 0 // Values can be -1 for decreasing, 0 for not decided and 1 for increasing

        var output = true
        var index = 1

        while (index < nums.size) {
            // Means we're trying to decided
            if (monotonic == 0) {
                // Do the comparison and get a conclusion
                if (nums[index - 1] < nums[index]) {
                    monotonic = 1
                } else if (nums[index - 1] > nums[index])
                    monotonic = -1
            } else {
                // We already know the given array's current status, which is either increasing or decreasing
                if (monotonic == 1) {
                    // Check if the current index is increasing or not decided and continue if true
                    if (nums[index - 1] > nums[index]) {
                        output = false
                        break
                    }
                } else {
                    // Check if the current index is decreasing or not decided and continue if true
                    if (nums[index - 1] < nums[index]) {
                        output = false
                        break
                    }
                }
            }
            index++
        }

        return output
    }
}
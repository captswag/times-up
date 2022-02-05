package leetcode._1437

class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var output = true
        var previousIndex = -1
        var index = 0

        while (index < nums.size) {
            if (previousIndex == -1) {
                if (nums[index] == 1) {
                    previousIndex = index
                }
            } else {
                if (nums[index] == 1) {
                    // Check the diff
                    val diff = index - previousIndex - 1
                    if (diff < k) {
                        output = false
                        break
                    }
                    previousIndex = index
                }
            }
            index++
        }

        return output
    }
}
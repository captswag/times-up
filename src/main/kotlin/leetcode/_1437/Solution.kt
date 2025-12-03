package leetcode._1437

class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var prevIndex = -1
        var currIndex = 0

        while (currIndex < nums.size) {
            if (nums[currIndex] == 1) {
                if (prevIndex == -1) {
                    prevIndex = currIndex
                } else {
                    if (currIndex - prevIndex - 1 < k) {
                        return false
                    }
                    prevIndex = currIndex
                }
            }
            currIndex++
        }

        return true
    }
}
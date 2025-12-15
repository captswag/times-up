package leetcode._3774

class Solution {

    fun absDifference(nums: IntArray, k: Int): Int {
        var sumSmallest = 0
        var sumLargest = 0
        nums.sort()

        for (index in 0 until k) {
            sumSmallest += nums[index]
            sumLargest += nums[nums.size - 1 - index]
        }

        return sumLargest - sumSmallest
    }
}
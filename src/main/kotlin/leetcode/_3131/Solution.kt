package leetcode._3131

class Solution {

    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var min1 = nums1[0]
        var min2 = nums2[0]

        for (index in nums1.indices) {
            if (nums1[index] < min1) {
                min1 = nums1[index]
            }
            if (nums2[index] < min2) {
                min2 = nums2[index]
            }
        }

        return min2 - min1
    }
}
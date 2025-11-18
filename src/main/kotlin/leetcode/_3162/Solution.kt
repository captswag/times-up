package leetcode._3162

class Solution {

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var result = 0

        for (index in nums2.indices) {
            nums2[index] = nums2[index] * k
        }

        for (num1 in nums1) {
            for (num2 in nums2) {
                if (num1 % (num2) == 0) {
                    result++
                }
            }
        }

        return result
    }
}
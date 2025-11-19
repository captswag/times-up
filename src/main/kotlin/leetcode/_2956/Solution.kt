package leetcode._2956

class Solution {

    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Array = IntArray(101)
        val nums2Array = IntArray(101)

        for (num in nums1) {
            nums1Array[num]++
        }

        for (num in nums2) {
            nums2Array[num]++
        }

        var answer1 = 0
        for (num in nums1) {
            if (nums2Array[num] > 0) {
                answer1++
            }
        }

        var answer2 = 0
        for (num in nums2) {
            if (nums1Array[num] > 0) {
                answer2++
            }
        }

        return intArrayOf(answer1, answer2)
    }
}
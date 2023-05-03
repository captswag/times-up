package leetcode._2540

class Solution {

    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var output = -1
        var index1 = 0
        var index2 = 0

        while (index1 < nums1.size && index2 < nums2.size) {
            if (nums1[index1] == nums2[index2]) {
                output = nums1[index1]
                break
            } else if (nums1[index1] > nums2[index2]) {
                index2++
            } else {
                index1++
            }
        }

        return output
    }
}
package refresh._3131

class Solution {

    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var mn1 = nums1[i]
        var mn2 = nums2[i]
        i++

        while (i < nums1.size) {
            if (nums1[i] < mn1) {
                mn1 = nums1[i]
            }
            if (nums2[i] < mn2) {
                mn2 = nums2[i]
            }
            i++
        }

        return mn2 - mn1
    }
}
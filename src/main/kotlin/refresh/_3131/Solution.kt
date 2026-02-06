package refresh._3131

class Solution {

    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var mn1 = nums1[i++]

        while (i < nums1.size) {
            if (nums1[i] < mn1) {
                mn1 = nums1[i]
            }
            i++
        }

        i = 0
        var mn2 = nums2[i++]

        while (i < nums2.size) {
            if (nums2[i] < mn2) {
                mn2 = nums2[i]
            }
            i++
        }

        return mn2 - mn1
    }
}
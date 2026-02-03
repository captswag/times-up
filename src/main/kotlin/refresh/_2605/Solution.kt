package refresh._2605

class Solution {

    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val seen = BooleanArray(10)

        var i = 0
        var mn1 = nums1[i]
        seen[nums1[i]] = true
        i++

        while (i < nums1.size) {
            if (nums1[i] < mn1) {
                mn1 = nums1[i]
            }
            seen[nums1[i]] = true
            i++
        }

        i = 0
        var mn2 = nums2[i]
        var mnCommon = if (seen[nums2[i]]) {
            nums2[i]
        } else {
            10
        }
        i++

        while (i < nums2.size) {
            if (nums2[i] < mn2) {
                mn2 = nums2[i]
            }
            if (seen[nums2[i]] && nums2[i] < mnCommon) {
                mnCommon = nums2[i]
            }
            i++
        }

        return if (mnCommon != 10) {
            mnCommon
        } else if (mn1 < mn2) {
            (mn1 * 10) + mn2
        } else {
            (mn2 * 10) + mn1
        }
    }
}
package refresh._2570

class Solution {

    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        var i = 0
        var j = 0
        val res = mutableListOf<IntArray>()

        while (i < nums1.size && j < nums2.size) {
            if (nums1[i][0] == nums2[j][0]) {
                res.add(intArrayOf(nums1[i][0], nums1[i][1] + nums2[j][1]))
                i++
                j++
            } else if (nums1[i][0] < nums2[j][0]) {
                res.add(nums1[i])
                i++
            } else {
                res.add(nums2[j])
                j++
            }
        }

        while (i < nums1.size) {
            res.add(nums1[i])
            i++
        }

        while (j < nums2.size) {
            res.add(nums2[j])
            j++
        }

        return res.toTypedArray()
    }
}
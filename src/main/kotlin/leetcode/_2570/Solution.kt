package leetcode._2570

class Solution {

    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        var rowIndex1 = 0
        var rowIndex2 = 0

        val output = Array(getUniqueIdCount(nums1, nums2)) { IntArray(2) }
        var rowIndexOutput = 0

        while (rowIndex1 < nums1.size && rowIndex2 < nums2.size) {
            if (nums1[rowIndex1][0] == nums2[rowIndex2][0]) {
                output[rowIndexOutput][0] = nums1[rowIndex1][0]
                output[rowIndexOutput][1] = nums1[rowIndex1][1] + nums2[rowIndex2][1]
                rowIndexOutput++
                rowIndex1++
                rowIndex2++
            } else if (nums1[rowIndex1][0] < nums2[rowIndex2][0]) {
                output[rowIndexOutput][0] = nums1[rowIndex1][0]
                output[rowIndexOutput][1] = nums1[rowIndex1][1]
                rowIndexOutput++
                rowIndex1++
            } else {
                output[rowIndexOutput][0] = nums2[rowIndex2][0]
                output[rowIndexOutput][1] = nums2[rowIndex2][1]
                rowIndexOutput++
                rowIndex2++
            }
        }

        while (rowIndex1 < nums1.size) {
            output[rowIndexOutput][0] = nums1[rowIndex1][0]
            output[rowIndexOutput][1] = nums1[rowIndex1][1]
            rowIndexOutput++
            rowIndex1++
        }

        while (rowIndex2 < nums2.size) {
            output[rowIndexOutput][0] = nums2[rowIndex2][0]
            output[rowIndexOutput][1] = nums2[rowIndex2][1]
            rowIndexOutput++
            rowIndex2++
        }

        return output
    }

    private fun getUniqueIdCount(nums1: Array<IntArray>, nums2: Array<IntArray>): Int {
        var count = 0
        var rowIndex1 = 0
        var rowIndex2 = 0

        while (rowIndex1 < nums1.size && rowIndex2 < nums2.size) {
            if (nums1[rowIndex1][0] == nums2[rowIndex2][0]) {
                count++
                rowIndex1++
                rowIndex2++
            } else if (nums1[rowIndex1][0] < nums2[rowIndex2][0]) {
                count++
                rowIndex1++
            } else {
                count++
                rowIndex2++
            }
        }

        if (rowIndex1 < nums1.size) {
            count += (nums1.size - rowIndex1)
        }

        if (rowIndex2 < nums2.size) {
            count += (nums2.size - rowIndex2)
        }

        return count
    }
}
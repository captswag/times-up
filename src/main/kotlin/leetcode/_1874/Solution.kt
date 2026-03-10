package leetcode._1874

import kotlin.math.min

class Solution {

    fun minProductSum(nums1: IntArray, nums2: IntArray): Int {
        val freq1 = IntArray(101)
        for (x in nums1) {
            freq1[x]++
        }

        val freq2 = IntArray(101)
        for (x in nums2) {
            freq2[x]++
        }

        var i = 0
        var j = freq2.size - 1

        var ans = 0
        while (i < freq1.size && j >= 0) {
            while (i < freq1.size && freq1[i] == 0) {
                i++
            }

            while (j >= 0 && freq2[j] == 0) {
                j--
            }

            if (i == freq1.size || j == -1) {
                break
            }

            val mn = min(freq1[i], freq2[j])
            ans += (mn * i * j)
            freq1[i] -= mn
            freq2[j] -= mn
        }

        return ans
    }
}
package leetcode._2605

class Solution {

    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val countArray = IntArray(9)

        var small1 = 10
        for (num in nums1) {
            countArray[num - 1]++
            if (num < small1) {
                small1 = num
            }
        }

        var small2 = 10
        for (num in nums2) {
            countArray[num - 1]++
            if (num < small2) {
                small2 = num
            }
        }

        var smallSet = 10
        for (index in countArray.indices) {
            if (countArray[index] == 2) {
                smallSet = index + 1
                break
            }
        }

        return if (smallSet == 10) {
            if (small1 < small2) {
                (small1 * 10) + small2
            } else {
                (small2 * 10) + small1
            }
        } else {
            smallSet
        }
    }
}
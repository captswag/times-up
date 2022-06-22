package leetcode._2215

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()

        for (num in nums1) {
            set1.add(num)
        }

        for (num in nums2) {
            set2.add(num)
        }

        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()

        for (num in set1) {
            if (!set2.contains(num)) {
                list1.add(num)
            }
        }

        for (num in set2) {
            if (!set1.contains(num)) {
                list2.add(num)
            }
        }
        return listOf(list1, list2)
    }
}
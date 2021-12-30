package leetcode._349

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = HashSet<Int>()
        val set2 = HashSet<Int>()

        for (num in nums1) {
            set1.add(num)
        }

        for (num in nums2) {
            set2.add(num)
        }

        val outputList = mutableListOf<Int>()
        for (num in set1) {
            if (set2.contains(num)) {
                // Then we found a value (intersection)
                outputList.add(num)
            }
        }

        return outputList.toIntArray()
    }
}
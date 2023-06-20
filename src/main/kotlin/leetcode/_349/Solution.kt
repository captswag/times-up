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

        set1.retainAll(set2)
        val intersectionArray = IntArray(set1.size)
        var index = 0
        for (num in set1) {
            intersectionArray[index++] = num
        }
        return intersectionArray
    }
}
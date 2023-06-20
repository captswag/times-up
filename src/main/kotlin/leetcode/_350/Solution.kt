package leetcode._350

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = mutableMapOf<Int, Int>()

        for (num in nums1) {
            map1[num] = map1.getOrDefault(num, 0) + 1
        }

        val intersectionList = mutableListOf<Int>()
        for (num in nums2) {
            if (map1.containsKey(num)) {
                intersectionList.add(num)
                val count = map1.getValue(num)
                if (count == 1) {
                    map1.remove(num)
                } else {
                    map1[num] = count - 1
                }
            }
        }

        return intersectionList.toIntArray()
    }
}
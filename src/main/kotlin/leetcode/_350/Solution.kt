package leetcode._350

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        // First add the first array elements to HashMap
        val map = mutableMapOf<Int, Int>()

        for (num in nums1) {
            val occurrence = map[num]
            if (occurrence == null) {
                map[num] = 1
            } else {
                map[num] = occurrence + 1
            }
        }

        val list = mutableListOf<Int>()

        for (num in nums2) {
            val occurrence = map[num]
            if (occurrence != null) {
                list.add(num)
                if (occurrence == 1) {
                    map.remove(num)
                } else {
                    map[num] = occurrence - 1
                }
            }
        }

        return list.toIntArray()
    }
}
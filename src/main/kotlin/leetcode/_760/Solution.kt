package leetcode._760

class Solution {
    fun anagramMappings(nums1: IntArray, nums2: IntArray): IntArray {
        val output = IntArray(nums1.size)
        val map = mutableMapOf<Int, Int>()

        for (index in nums2.indices) {
            map[nums2[index]] = index
        }

        var outputIndex = 0
        for (num in nums1) {
            val index = map[num]
            if (index != null) {
                output[outputIndex++] = index
            }
        }

        return output
    }
}
package refresh._760

class Solution {

    fun anagramMappings(nums1: IntArray, nums2: IntArray): IntArray {
        val res = IntArray(nums1.size)

        val map = mutableMapOf<Int, Int>()
        for (index in nums2.indices) {
            map[nums2[index]] = index
        }

        for (index in nums1.indices) {
            res[index] = map.getValue(nums1[index])
        }

        return res
    }
}
package refresh._2215

class Solution {

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = mutableSetOf<Int>()
        for (num in nums1) {
            set1.add(num)
        }

        val set2 = mutableSetOf<Int>()
        for (num in nums2) {
            set2.add(num)
        }

        val res1 = mutableListOf<Int>()
        for (num in set1) {
            if (num !in set2) {
                res1.add(num)
            }
        }

        val res2 = mutableListOf<Int>()
        for (num in set2) {
            if (num !in set1) {
                res2.add(num)
            }
        }

        return listOf(res1, res2)
    }
}
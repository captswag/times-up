package refresh._2032

class Solution {

    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        /**
         * Got this solution from LeetCode Solutions
         * https://leetcode.com/problems/two-out-of-three/solutions/1513355/three-count-arrays-by-votrubac-hm1v
         */
        val frequency = Array(3) { IntArray(101) }

        for (num in nums1) {
            frequency[0][num] = 1
        }

        for (num in nums2) {
            frequency[1][num] = 1
        }

        for (num in nums3) {
            frequency[2][num] = 1
        }

        val res = mutableListOf<Int>()
        for (i in frequency[0].indices) {
            if (frequency[0][i] + frequency[1][i] + frequency[2][i] > 1) {
                res.add(i)
            }
        }

        return res
    }
}
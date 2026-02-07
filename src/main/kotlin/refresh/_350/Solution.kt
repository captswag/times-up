package refresh._350

class Solution {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val freq = IntArray(1001)

        for (num in nums2) {
            freq[num]++
        }

        val ans = mutableListOf<Int>()
        for (num in nums1) {
            if (freq[num] > 0) {
                ans.add(num)
                freq[num]--
            }
        }

        return ans.toIntArray()
    }
}
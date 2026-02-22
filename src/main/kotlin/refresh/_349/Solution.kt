package refresh._349

class Solution {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val seen = BooleanArray(1001)

        for (x in nums2) {
            seen[x] = true
        }

        val res = mutableListOf<Int>()

        for (x in nums1) {
            if (seen[x]) {
                res.add(x)
                seen[x] = false
            }
        }

        return res.toIntArray()
    }
}
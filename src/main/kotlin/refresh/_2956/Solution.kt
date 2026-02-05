package refresh._2956

class Solution {

    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val seen1 = BooleanArray(101)
        for (num in nums1) {
            seen1[num] = true
        }

        val seen2 = BooleanArray(101)
        for (num in nums2) {
            seen2[num] = true
        }

        val ans = IntArray(2)

        for (num in nums1) {
            if (seen2[num]) {
                ans[0]++
            }
        }

        for (num in nums2) {
            if (seen1[num]) {
                ans[1]++
            }
        }

        return ans
    }
}
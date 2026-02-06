package refresh._3162

class Solution {

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var cnt = 0

        for (num2 in nums2) {
            val x = num2 * k
            for (num1 in nums1) {
                if (num1 % x == 0) {
                    cnt++
                }
            }
        }

        return cnt
    }
}
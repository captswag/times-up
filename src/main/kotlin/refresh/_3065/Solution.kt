package refresh._3065

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        var cnt = 0

        for (num in nums) {
            if (num < k) {
                cnt++
            }
        }

        return cnt
    }
}
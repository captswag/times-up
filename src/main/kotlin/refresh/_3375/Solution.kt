package refresh._3375

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        val freq = IntArray(101)

        for (num in nums) {
            freq[num]++
        }

        var cnt = 0
        for (i in freq.indices) {
            if (freq[i] > 0) {
                if (i > k) {
                    cnt++
                } else if (i < k) {
                    return -1
                }
            }
        }

        return cnt
    }
}
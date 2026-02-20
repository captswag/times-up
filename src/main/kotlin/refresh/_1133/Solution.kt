package refresh._1133

class Solution {

    fun largestUniqueNumber(nums: IntArray): Int {
        val freq = IntArray(1001)

        for (num in nums) {
            freq[num]++
        }

        for (i in freq.size - 1 downTo 0) {
            if (freq[i] == 1) {
                return i
            }
        }

        return -1
    }
}
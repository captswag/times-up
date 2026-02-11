package refresh._3712

class Solution {

    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
        val freq = IntArray(101)

        for (num in nums) {
            freq[num]++
        }

        var sum = 0
        for (i in freq.indices) {
            if (freq[i] > 0 && freq[i] % k == 0) {
                sum += (i * freq[i])
            }
        }

        return sum
    }
}
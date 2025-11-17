package leetcode._3712

class Solution {

    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        var output = 0
        for (num in nums) {
            if (frequency[num] % k == 0) {
                output += num
            }
        }

        return output
    }
}
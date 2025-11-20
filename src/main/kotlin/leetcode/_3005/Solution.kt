package leetcode._3005

class Solution {

    fun maxFrequencyElements(nums: IntArray): Int {
        val frequency = IntArray(101)
        var max = 0

        for (num in nums) {
            if (++frequency[num] > max) {
                max = frequency[num]
            }
        }

        var output = 0
        for (f in frequency) {
            if (f == max) {
                output += max
            }
        }

        return output
    }
}
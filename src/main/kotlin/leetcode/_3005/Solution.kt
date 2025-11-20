package leetcode._3005

class Solution {

    fun maxFrequencyElements(nums: IntArray): Int {
        val frequency = IntArray(101)
        var max = 0

        for (num in nums) {
            val newFrequency = ++frequency[num]
            if (newFrequency > max) {
                max = newFrequency
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
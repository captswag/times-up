package leetcode._2341

class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
        val countArray = IntArray(101)

        for (num in nums) {
            countArray[num]++
        }

        var pairs = 0
        var leftovers = 0
        for (count in countArray) {
            pairs += (count / 2)
            leftovers += (count % 2)
        }

        return intArrayOf(pairs, leftovers)
    }
}
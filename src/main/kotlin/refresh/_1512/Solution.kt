package refresh._1512

class Solution {

    fun numIdenticalPairs(nums: IntArray): Int {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        var goodPairs = 0
        for (num in nums) {
            frequency[num]--
            goodPairs += frequency[num]
        }

        return goodPairs
    }
}
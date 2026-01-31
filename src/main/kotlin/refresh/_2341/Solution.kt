package refresh._2341

class Solution {

    fun numberOfPairs(nums: IntArray): IntArray {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        val res = IntArray(2)
        for (f in frequency) {
            res[0] += (f / 2)
            res[1] += (f % 2)
        }

        return res
    }
}
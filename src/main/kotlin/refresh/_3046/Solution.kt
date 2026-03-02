package refresh._3046

class Solution {

    fun isPossibleToSplit(nums: IntArray): Boolean {
        val freq = IntArray(101)

        for (x in nums) {
            freq[x]++
        }

        for (f in freq) {
            if (f > 2) {
                return false
            }
        }

        return true
    }
}
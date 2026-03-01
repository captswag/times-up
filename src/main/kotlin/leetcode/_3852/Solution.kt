package leetcode._3852

class Solution {

    fun minDistinctFreqPair(nums: IntArray): IntArray {
        val freq = IntArray(101)
        for (x in nums) {
            freq[x]++
        }

        var i = 0
        while (i < freq.size && freq[i] == 0) {
            i++
        }

        val first = i
        i++

        while (i < freq.size && (freq[i] == 0 || freq[i] == freq[first])) {
            i++
        }

        return if (i == freq.size) {
            intArrayOf(-1, -1)
        } else {
            intArrayOf(first, i)
        }
    }
}
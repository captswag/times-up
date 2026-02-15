package leetcode._3842

class Solution {

    fun toggleLightBulbs(bulbs: List<Int>): List<Int> {
        val freq = IntArray(101)

        for (x in bulbs) {
            freq[x]++
        }

        val ans = mutableListOf<Int>()
        for (i in 1 until freq.size) {
            if (freq[i] and 1 == 1) {
                ans.add(i)
            }
        }

        return ans
    }
}
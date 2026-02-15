package leetcode._3842

class Solution {

    fun toggleLightBulbs(bulbs: List<Int>): List<Int> {
        val on = BooleanArray(101)

        for (x in bulbs) {
            on[x] = !on[x]
        }

        val ans = mutableListOf<Int>()
        for (i in 1 until on.size) {
            if (on[i]) {
                ans.add(i)
            }
        }

        return ans
    }
}
package leetcode._771

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val stonesArray = IntArray(52)

        for (c in stones) {
            val index = getIndex(c)
            stonesArray[index]++
        }

        var output = 0
        for (c in jewels) {
            val index = getIndex(c)
            output += stonesArray[index]
        }
        return output
    }

    private fun getIndex(c: Char): Int = if (c.isUpperCase()) {
        c - 'A'
    } else {
        c - 'a' + 26 // 26 is the base index
    }
}
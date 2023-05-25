package leetcode._771

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewelSet = mutableSetOf<Char>()

        for (jewel in jewels) {
            jewelSet.add(jewel)
        }

        var output = 0
        for (stone in stones) {
            if (stone in jewelSet) {
                output++
            }
        }
        return output
    }
}
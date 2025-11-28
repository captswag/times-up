package leetcode._2609

class Solution {

    fun findTheLongestBalancedSubstring(s: String): Int {
        var count0 = 0
        var count1 = 0
        var maxBalanced = 0
        for (c in s) {
            when (c) {
                '0' -> {
                    if (count1 > 0) {
                        count0 = 0
                        count1 = 0
                    }
                    count0++
                }
                '1' -> {
                    count1++
                    val currBalanced = Math.min(count0, count1)
                    maxBalanced = Math.max(maxBalanced, (currBalanced * 2))
                }
            }
        }

        return maxBalanced
    }
}
package leetcode._2287

class Solution {
    fun rearrangeCharacters(s: String, target: String): Int {
        val sCount = IntArray(26)
        for (c in s) {
            val cToIndex = c.toInt() - 97
            sCount[cToIndex] = sCount[cToIndex] + 1
        }

        val targetCount = IntArray(26)
        for (c in target) {
            val cToIndex = c.toInt() - 97
            targetCount[cToIndex] = targetCount[cToIndex] + 1
        }

        var count = 0
        var index = 0
        while (true) {
            val sCountValue = sCount[index]
            val targetCountValue = targetCount[index]
            val diff = sCountValue - targetCountValue
            if (diff < 0) {
                break
            } else {
                sCount[index] = diff
                if (index == 25) {
                    index = 0
                    count++
                } else {
                    index++
                }
            }
        }

        return count
    }
}
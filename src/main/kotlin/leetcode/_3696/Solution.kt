package leetcode._3696

import kotlin.math.max

class Solution {

    fun maxDistance(words: Array<String>): Int {
        if (words[0] != words[words.size - 1]) {
            return words.size
        }

        for (i in 1 until words.size - 1) {
            if (words[i] != words[0]) {
                return max(i + 1, words.size - i)
            }
        }

        return 0
    }
}
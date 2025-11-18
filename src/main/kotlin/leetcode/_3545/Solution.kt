package leetcode._3545

import java.util.*

class Solution {

    fun minDeletion(s: String, k: Int): Int {
        val charArray = IntArray(26)
        var distinct = 0

        for (c in s) {
            if (charArray[c - 'a'] == 0) {
                distinct++
            }
            charArray[c - 'a']++
        }

        val queue = PriorityQueue<Int>()
        for (frequency in charArray) {
            if (frequency != 0) {
                queue.add(frequency)
            }
        }

        var result = 0
        while (distinct > k) {
            result += queue.poll()
            distinct--
        }

        return result
    }
}
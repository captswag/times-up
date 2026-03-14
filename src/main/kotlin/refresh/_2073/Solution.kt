package refresh._2073

import kotlin.math.min

class Solution {

    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        /**
         * Got this from LeetCode Editorial
         * https://leetcode.com/problems/time-needed-to-buy-tickets/editorial/#approach-3-using-one-pass
         */
        var cnt = 0

        for (i in tickets.indices) {
            cnt += if (i <= k) {
                min(tickets[i], tickets[k])
            } else {
                min(tickets[i], tickets[k] - 1)
            }
        }

        return cnt
    }
}
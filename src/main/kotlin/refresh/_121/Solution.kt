package refresh._121

import kotlin.math.max
import kotlin.math.min

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var mx = 0
        var mn = prices[0]

        for (i in 1 until prices.size) {
            mx = max(mx, prices[i] - mn)
            mn = min(mn, prices[i])
        }

        return mx
    }
}
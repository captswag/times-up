package refresh._1523

class Solution {

    fun countOdds(low: Int, high: Int): Int {
        var count = (high - low) / 2
        if (low and 1 == 1 || high and 1 == 1) {
            count++
        }
        return count
    }
}
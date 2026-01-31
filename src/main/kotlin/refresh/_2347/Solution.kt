package refresh._2347

class Solution {

    fun bestHand(ranks: IntArray, suits: CharArray): String {
        return if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            "Flush"
        } else {
            val frequency = IntArray(14)
            for (rank in ranks) {
                frequency[rank]++
            }

            var res = "High Card"
            for (f in frequency) {
                if (f > 2) {
                    return "Three of a Kind"
                } else if (f == 2) {
                    res = "Pair"
                }
            }

            return res
        }
    }
}
package refresh._2073

class Solution {

    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var cnt = 0
        var i = 0

        while (tickets[k] != 0) {
            if (tickets[i] != 0) {
                tickets[i]--
                cnt++
            }
            i++
            if (i == tickets.size) {
                i = 0
            }
        }

        return cnt
    }
}
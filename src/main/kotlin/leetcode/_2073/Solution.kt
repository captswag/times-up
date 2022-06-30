package leetcode._2073

class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var output = 0
        for (index in 0 until k) {
            output += if (tickets[index] <= tickets[k]) {
                tickets[index]
            } else {
                tickets[k]
            }
        }

        for (index in k + 1 until tickets.size) {
            output += if (tickets[index] <= tickets[k] - 1) {
                tickets[index]
            } else {
                tickets[k] - 1
            }
        }

        return output + tickets[k]
    }
}
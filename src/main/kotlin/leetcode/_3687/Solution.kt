package leetcode._3687

class Solution {

    fun lateFee(daysLate: IntArray): Int {
        var output = 0

        for (dayLate in daysLate) {
            if (dayLate == 1) {
                output += 1
            } else if (dayLate < 6) {
                output += (2 * dayLate)
            } else {
                output += (3 * dayLate)
            }
        }

        return output
    }
}
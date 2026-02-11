package refresh._3687

class Solution {

    fun lateFee(daysLate: IntArray): Int {
        var ans = 0

        for (x in daysLate) {
            ans += if (x == 1) {
                1
            } else if (x > 5) {
                (x * 3)
            } else {
                (x * 2)
            }
        }

        return ans
    }
}
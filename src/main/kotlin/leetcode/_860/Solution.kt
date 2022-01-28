package leetcode._860

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var count5 = 0
        var count10 = 0
        var output = true

        for (bill in bills) {
            if (bill == 5) {
                count5++
            } else if (bill == 10) {
                // Check if you have 1 5$ in your hand
                if (count5 > 0) {
                    count5--
                    count10++
                } else {
                    output = false
                }
            } else if (bill == 20) {
                // Check if you have 1 10$ and 1 5$ or 3 5$ in your hand
                if (count10 > 0 && count5 > 0) {
                    count10--
                    count5--
                } else if (count5 > 2) {
                    count5 -= 3
                } else {
                    output = false
                }
            }
        }

        return output
    }
}
package leetcode._1427

class Solution {

    fun stringShift(s: String, shift: Array<IntArray>): String {
        var amount = 0

        for (s in shift) {
            if (s[0] == 0) { // left
                amount -= s[1]
            } else { // right
                amount += s[1]
            }
        }

        return if (amount < 0) {
            amount *= -1
            amount %= s.length
            s.substring(amount, s.length) + s.substring(0, amount)
        } else {
            amount %= s.length
            s.substring(s.length - amount, s.length) + s.substring(0, s.length - amount)
        }
    }
}
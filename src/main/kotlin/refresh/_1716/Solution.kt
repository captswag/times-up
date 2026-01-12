package refresh._1716

class Solution {

    fun totalMoney(n: Int): Int {
        var res = 0

        for (day in 1..n) {
            val money = if (day % 7 == 0) {
                7 + (day / 7) - 1
            } else {
                (day / 7) + (day % 7)
            }
            res += money
        }

        return res
    }
}
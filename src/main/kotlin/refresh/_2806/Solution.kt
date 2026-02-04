package refresh._2806

class Solution {

    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val d = purchaseAmount % 10
        val r = if (d >= 5) {
            up(purchaseAmount)
        } else {
            down(purchaseAmount)
        }
        return 100 - r
    }

    private fun up(x: Int): Int {
        var cur = 0

        while (cur < x) {
            cur += 10
        }

        return cur
    }

    private fun down(x: Int): Int {
        var cur = 100

        while (cur > x) {
            cur -= 10
        }

        return cur
    }
}
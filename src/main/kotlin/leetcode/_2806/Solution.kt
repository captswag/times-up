package leetcode._2806

class Solution {

    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val lowerDistance = purchaseAmount % 10
        val higherDistance = 10 - lowerDistance

        val roundedAmount = if (lowerDistance < higherDistance) {
            purchaseAmount - lowerDistance
        } else {
            purchaseAmount + higherDistance
        }

        return 100 - roundedAmount
    }
}
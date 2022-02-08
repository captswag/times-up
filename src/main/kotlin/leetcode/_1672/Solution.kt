package leetcode._1672

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var output = Integer.MIN_VALUE
        for (customer in accounts) {
            var customerWealth = 0

            for (wealthInBank in customer) {
                customerWealth += wealthInBank
            }

            if (customerWealth > output) {
                output = customerWealth
            }
        }

        return output
    }
}
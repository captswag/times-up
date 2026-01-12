package refresh._1672

class Solution {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0

        for (i in accounts.indices) {
            var currWealth = 0
            for (j in accounts[i].indices) {
                currWealth += accounts[i][j]
            }
            if (currWealth > maxWealth) {
                maxWealth = currWealth
            }
        }

        return maxWealth
    }
}
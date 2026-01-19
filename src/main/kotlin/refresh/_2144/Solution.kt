package refresh._2144

class Solution {

    fun minimumCost(cost: IntArray): Int {
        val frequency = IntArray(101)

        for (c in cost) {
            frequency[c]++
        }

        var i = frequency.size - 1
        var count = 0
        var res = 0
        while (i > 0) {
            if (frequency[i] == 0) {
                i--
            } else {
                if (count % 3 != 2) {
                    res += i
                }
                frequency[i]--
                count++
            }
        }

        return res
    }
}
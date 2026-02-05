package refresh._2965

class Solution {

    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val freq = IntArray((grid.size * grid.size) + 1)

        for (g in grid) {
            for (v in g) {
                freq[v]++
            }
        }

        val ans = IntArray(2)

        for (i in 1 until freq.size) {
            if (freq[i] == 0) {
                ans[1] = i
            } else if (freq[i] == 2) {
                ans[0] = i
            }
        }

        return ans
    }
}
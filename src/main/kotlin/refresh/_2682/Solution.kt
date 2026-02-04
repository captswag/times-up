package refresh._2682

class Solution {

    fun circularGameLosers(n: Int, k: Int): IntArray {
        val seen = BooleanArray(n)
        var cur = 0
        var step = 1

        while (!seen[cur]) {
            seen[cur] = true
            cur += (step * k)
            cur %= n
            step++
        }

        val ans = mutableListOf<Int>()
        for (i in seen.indices) {
            if (!seen[i]) {
                ans.add(i + 1)
            }
        }

        return ans.toIntArray()
    }
}
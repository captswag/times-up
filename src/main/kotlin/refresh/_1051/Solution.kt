package refresh._1051

class Solution {

    fun heightChecker(heights: IntArray): Int {
        val freq = IntArray(101)

        for (x in heights) {
            freq[x]++
        }

        var i = 0
        var v = 0
        var cnt = 0

        while (i < heights.size) {
            if (freq[v] > 0) {
                if (v != heights[i]) {
                    cnt++
                }
                freq[v]--
                i++
            } else {
                v++
            }
        }

        return cnt
    }
}
package refresh._2951

class Solution {

    fun findPeaks(mountain: IntArray): List<Int> {
        val ans = mutableListOf<Int>()

        for (i in 1 until mountain.size - 1) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                ans.add(i)
            }
        }

        return ans
    }
}
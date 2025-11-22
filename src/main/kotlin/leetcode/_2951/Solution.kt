package leetcode._2951

class Solution {

    fun findPeaks(mountain: IntArray): List<Int> {
        val output = mutableListOf<Int>()

        for (index in 1 until mountain.size - 1) {
            if (mountain[index] > mountain[index - 1] && mountain[index] > mountain[index + 1]) {
                output.add(index)
            }
        }

        return output
    }
}
package leetcode._2078

class Solution {

    fun maxDistance(colors: IntArray): Int {
        var output = 0

        for (index in colors.indices) {
            if (colors[0] != colors[index]) {
                output = Math.max(output, index)
            }
            if (colors[colors.size - 1] != colors[index]) {
                output = Math.max(output, colors.size - 1 - index)
            }
        }

        return output
    }
}
package leetcode._3206

class Solution {

    fun numberOfAlternatingGroups(colors: IntArray): Int {
        var output = 0

        for (index in colors.indices) {
            val secondIndex = (index + 1) % colors.size
            val thirdIndex = (index + 2) % colors.size

            if (colors[index] == colors[thirdIndex] && colors[index] != colors[secondIndex]) {
                output++
            }
        }

        return output
    }
}
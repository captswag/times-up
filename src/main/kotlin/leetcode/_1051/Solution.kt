package leetcode._1051

class Solution {

    fun heightChecker(heights: IntArray): Int {
        val countArray = IntArray(101)

        // Find count of each element in the heights array
        for (height in heights) {
            countArray[height]++
        }

        // Find cumulative sum of the countArray
        for (index in 1 until countArray.size) {
            countArray[index] = countArray[index] + countArray[index - 1]
        }

        var output = 0
        for (index in heights.indices) {
            val start = countArray[heights[index] - 1]
            val end = countArray[heights[index]]
            if (index !in start until end) {
                output++
            }
        }
        return output
    }
}
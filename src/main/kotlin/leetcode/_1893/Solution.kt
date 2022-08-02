package leetcode._1893

class Solution {
    fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {
        val overlapArray = IntArray(52)

        for (range in ranges) {
            overlapArray[range[0]]++
            overlapArray[range[1] + 1]--
        }

        var output = true
        var overlap = 0
        for (value in 1..right) {
            overlap += overlapArray[value]
            if (value >= left && overlap == 0) {
                output = false
                break
            }
        }

        return output
    }
}
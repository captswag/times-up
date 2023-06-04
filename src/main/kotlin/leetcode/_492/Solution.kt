package leetcode._492

class Solution {

    fun constructRectangle(area: Int): IntArray {
        val output = intArrayOf(area, 1)
        var minDiff = area - 1

        for (length in area / 2 downTo 2) {
            if (area % length == 0) {
                val breadth = area / length
                if (length >= breadth) {
                    val currentDiff = length - breadth
                    if (currentDiff < minDiff) {
                        output[0] = length
                        output[1] = breadth
                        minDiff = currentDiff
                    }
                } else {
                    break
                }
            }
        }

        return output
    }
}
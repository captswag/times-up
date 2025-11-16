package leetcode._3285

class Solution {

    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        val output = mutableListOf<Int>()

        for (index in 1 until height.size) {
            if (height[index - 1] > threshold) {
                output.add(index)
            }
        }

        return output
    }
}
package refresh._3285

class Solution {

    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        val ans = mutableListOf<Int>()

        for (i in 1 until height.size) {
            if (height[i - 1] > threshold) {
                ans.add(i)
            }
        }

        return ans
    }
}
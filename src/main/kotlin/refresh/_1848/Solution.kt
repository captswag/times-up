package refresh._1848

class Solution {

    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var minDistance = Integer.MAX_VALUE

        for (i in nums.indices) {
            if (nums[i] == target) {
                val currDistance = Math.abs(i - start)
                if (currDistance < minDistance) {
                    minDistance = currDistance
                }
            }
        }

        return minDistance
    }
}
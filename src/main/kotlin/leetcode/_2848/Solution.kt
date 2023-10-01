package leetcode._2848

class Solution {

    fun numberOfPoints(nums: List<List<Int>>): Int {
        val set = mutableSetOf<Int>()

        for (coordinates in nums) {
            for (start in coordinates[0]..coordinates[1]) {
                set.add(start)
            }
        }

        return set.size
    }
}
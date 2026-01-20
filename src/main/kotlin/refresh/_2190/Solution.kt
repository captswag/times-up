package refresh._2190

class Solution {

    fun mostFrequent(nums: IntArray, key: Int): Int {
        val map = mutableMapOf<Int, Int>()
        var max = 0
        var res = 0

        for (i in 0 until nums.size - 1) {
            if (nums[i] == key) {
                map[nums[i + 1]] = map.getOrDefault(nums[i + 1], 0) + 1
                if (map.getValue(nums[i + 1]) > max) {
                    max = map.getValue(nums[i + 1])
                    res = nums[i + 1]
                }
            }
        }

        return res
    }
}
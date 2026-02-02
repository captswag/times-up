package refresh._2465

class Solution {

    fun distinctAverages(nums: IntArray): Int {
        nums.sort()
        var l = 0
        var r = nums.size - 1
        val set = mutableSetOf<Double>()

        while (l < r) {
            set.add((nums[l] + nums[r]) / 2.0)
            l++
            r--
        }

        return set.size
    }
}
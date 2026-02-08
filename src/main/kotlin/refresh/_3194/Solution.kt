package refresh._3194

class Solution {

    fun minimumAverage(nums: IntArray): Double {
        nums.sort()

        var l = 0
        var r = nums.size - 1
        var mn = 100

        while (l < r) {
            val cur = nums[l] + nums[r]
            if (cur < mn) {
                mn = cur
            }
            l++
            r--
        }

        return mn.toDouble() / 2
    }
}
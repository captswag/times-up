package refresh._3038

class Solution {

    fun maxOperations(nums: IntArray): Int {
        var i = 0
        val score = nums[i] + nums[++i]
        var cnt = 1
        i++

        while (i + 1 < nums.size && nums[i] + nums[i + 1] == score) {
            cnt++
            i += 2
        }

        return cnt
    }
}
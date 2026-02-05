package refresh._3038

class Solution {

    fun maxOperations(nums: IntArray): Int {
        val score = nums[0] + nums[1]
        var i = 2
        var cnt = 1

        while (i + 1 < nums.size && nums[i] + nums[i + 1] == score) {
            cnt++
            i += 2
        }

        return cnt
    }
}
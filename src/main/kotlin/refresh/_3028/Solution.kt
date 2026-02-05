package refresh._3028

class Solution {

    fun returnToBoundaryCount(nums: IntArray): Int {
        var cur = 0
        var cnt = 0

        for (num in nums) {
            cur += num

            if (cur == 0) {
                cnt++
            }
        }

        return cnt
    }
}
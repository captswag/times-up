package refresh._3736

class Solution {

    fun minMoves(nums: IntArray): Int {
        var mx = 1
        for (num in nums) {
            if (num > mx) {
                mx = num
            }
        }

        var ans = 0
        for (num in nums) {
            ans += (mx - num)
        }

        return ans
    }
}
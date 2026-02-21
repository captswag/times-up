package refresh._1150

class Solution {

    fun isMajorityElement(nums: IntArray, target: Int): Boolean {
        var cnt = 1
        var mx = cnt
        var mxVal = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                cnt++
                if (cnt > mx) {
                    mx = cnt
                    mxVal = nums[i]
                }
            } else {
                cnt = 1
            }
        }

        return mx > nums.size / 2 && mxVal == target
    }
}